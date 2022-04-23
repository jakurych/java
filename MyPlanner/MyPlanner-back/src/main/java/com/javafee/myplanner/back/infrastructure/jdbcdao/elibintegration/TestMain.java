package com.javafee.myplanner.back.infrastructure.jdbcdao.elibintegration;

import lombok.extern.slf4j.Slf4j;

import java.sql.ResultSet;
import java.sql.SQLException;

@Slf4j
public class TestMain {
    public static void main(String[] args) {
        DaoELibrary daoMyElibrary = new DaoELibrary();

        ResultSet result = null;
        String reservations = "select c.name, c.surname, c.pesel, \n" +
                "ll.lend_date, ll.returned_date, \n" +
                "lv.inventory_number, \n" +
                "lb.title, lb.isbn_number\n" +
                "from com_user_data c\n" +
                "join lib_client lc on c.id_user_data = lc.id_client\n" +
                "join lib_reservation lr on lc.id_client = lr.id_client\n" +
                "join lib_lend ll on ll.id_reservation = lr.id_reservation \n" +
                "join lib_volume lv on ll.id_volume = lv.id_volume\n" +
                "join lib_book lb on lb.id_book = lv.id_book \n" +
                "where ll.is_returned = false ;; ";

        result = daoMyElibrary.executeQuery(reservations);
        try {
            while (result.next())
                log.info("Client: "+result.getString("name")+result.getString("surname")+result.getString(""));
                //log.info("Reservation Data: " + result.getInt("salary") + ", " + result.getString("surname"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        /*
        ResultSet result = null;
        String actionBooks = "SELECT lb.*, lc.name FROM lib_book lb \n" +
                "\tjoin lib_book_category lbc on lb.id_book = lbc.id_book\n" +
                "\tjoin lib_category lc on lc.id_category = lbc.id_category\n" +
                "\twhere lc.name = \'Akcja\'; ";

        String reservation = "";
        result = daoMyElibrary.executeQuery(actionBooks);
        try {
            while (result.next())
                log.info("Employee Data: " + result.getInt("salary") + ", " + result.getString("surname"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */


        // Query 1 =====================================================================================================
        /*result = daoMyElibrary.executeQuery(actionBooks);
        try {
            while (result.next())
                log.info(result.getString("title") + " " + result.getInt("number_of_page")+ " "+ result.getString("name")
                +" "+ result.getInt("number_of_page")+" "+ result.getString("isbn_number")+" "+result.getInt("number_of_tomes"));
        } catch (SQLException e) {
            e.printStackTrace();
        }*/

        /*// Query 2 =====================================================================================================
        result = daoMyPlanner.executeQuery(employeesFirstThreeMaxSalariesQuery);
        try {
            while (result.next())
                log.info("Employee Data: " + result.getInt("salary") + ", " + result.getString("surname"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Query 3 =====================================================================================================
        result = daoMyPlanner.executeQuery(employeesWithExpensiveProject);
        try {
            while (result.next())
                log.info("Name: "+ result.getString("employee name")+", "+result.getString("employee surname")+", "+result.getString("project name"));
        } catch (SQLException e) {
            e.printStackTrace();
        }*/


    }
}
