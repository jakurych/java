package com.javafee.myplanner.back.infrastructure.jdbcdao.elibintegration;

import com.javafee.myplanner.back.domain.Reservation;
import lombok.extern.slf4j.Slf4j;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DaoELibrary implements Dao {
    private Connection connection;

    private String reservations = "select c.name, c.surname, c.pesel, \n" +
            "ll.lend_date, ll.returned_date, \n" +
            "lv.inventory_number, \n" +
            "lb.title, lb.isbn_number\n" +
            "from com_user_data c\n" +
            "join lib_client lc on c.id_user_data = lc.id_client\n" +
            "join lib_reservation lr on lc.id_client = lr.id_client\n" +
            "join lib_lend ll on ll.id_reservation = lr.id_reservation \n" +
            "join lib_volume lv on ll.id_volume = lv.id_volume\n" +
            "join lib_book lb on lb.id_book = lv.id_book \n" +
            "where ll.is_returned = false;";

   public DaoELibrary() {
        try {
            connection = DriverManager.getConnection(ELibDBProperties.CONNECTION_STRING);
            //log.info("Connection established: " + connection.getMetaData().getDatabaseProductName() + " v" + connection.getMetaData().getDatabaseProductVersion());
        } catch (SQLException e) {
            //log.error(e.getMessage());
        }
    }

    public ResultSet executeQuery(String query) {
        try {
            Statement statement = connection.createStatement();
            return statement.executeQuery(query);
        } catch (SQLException e) {
            //log.error(e.getMessage());
        }
        return null;
    }

    public List<Reservation> findAll() {
        ResultSet result = executeQuery(reservations);
        List<Reservation> reservationsList = new ArrayList<>();
        try {
            while (result.next()) {
                               reservationsList.add(
                        Reservation.builder()
                                .name(result.getString("name"))
                                .surname(result.getString("surname"))
                                .pesel(result.getString("pesel"))
                                .lendDate(result.getDate("lend_date"))
                                .returnedDate(result.getDate("returned_date"))
                                .inventoryNumber(result.getString("inventory_number"))
                                .bookTitle(result.getString("bookTitle"))
                                .isbnNumber(result.getString("isbn_number"))
                                .build()
                );

                /*

                result.getString("name")+result.getString("surname")+result.getString("pesel")+result.getString("lend_date")+
                        result.getString("returned_date")+result.getString("inventory_number")+
                        result.getString("title")+result.getString("isbn_number")
                 */

            }
            //log.info("Reservation Data: " + result.getInt("salary") + ", " + result.getString("surname"));


            /*
            private String name;
            private String surname;
            private String pesel;
            private String docNumber;
            private String bookTitle;
            private String isbnNumber;
            private String inventory_number;
            private String title;
             */
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reservationsList;
    }

    public void close() {
        try {
            if (!Objects.isNull(connection))
                connection.close();
        } catch (SQLException e) {
            //log.error(e.getMessage());
        }
    }
}
