package com.javafee.myplanner.back.infrastructure.jdbcdao.elibintegration;

import lombok.extern.slf4j.Slf4j;

import java.sql.ResultSet;
import java.sql.SQLException;

@Slf4j
public class TestMain {
    public static void main(String[] args) {
        DaoELibrary daoMyElibrary = new DaoELibrary();

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
