package com.javafee.myplanner.back.infrastructure.jdbcdao.training;

import lombok.extern.slf4j.Slf4j;

import java.sql.ResultSet;
import java.sql.SQLException;

@Slf4j
public class TestMain {
    public static void main(String[] args) {
        DaoMyPlanner daoMyPlanner = new DaoMyPlanner();

        ResultSet result = null;
        String employeesAvgSalaryQuery = "select floor(res.avg) from (select avg(salary) from employee) as res",
                employeesFirstThreeMaxSalariesQuery = "select salary, surname from employee where salary is not null " +
                        "and surname like 'N%' order by salary desc limit 3", employeesWithExpensiveProject = "select e.\"name\" as \"employee name\", e.surname as \"employee surname\", p.\"name\" as \"project name\"  from employee e \n" +
                "\tjoin projects p on p.id_manager  = e.id\n" +
                "\twhere p.budget > 3000;";

        // Query 1 =====================================================================================================
        result = daoMyPlanner.executeQuery(employeesAvgSalaryQuery);
        try {
            while (result.next())
                log.info("Avg: " + result.getInt("floor"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Query 2 =====================================================================================================
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
        }




    }
}
