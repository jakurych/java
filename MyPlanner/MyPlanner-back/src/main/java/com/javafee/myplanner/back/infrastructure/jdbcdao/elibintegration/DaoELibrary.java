package com.javafee.myplanner.back.infrastructure.jdbcdao.elibintegration;

import lombok.extern.slf4j.Slf4j;

import java.sql.*;
import java.util.Objects;

@Slf4j
public class DaoELibrary implements Dao {
    private static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(ELibDBProperties.CONNECTION_STRING);
            log.info("Connection established: " + connection.getMetaData().getDatabaseProductName() + " v" + connection.getMetaData().getDatabaseProductVersion());
        } catch (SQLException e) {
            log.error(e.getMessage());
        }
    }

    public ResultSet executeQuery(String query) {
        try {
            Statement statement = connection.createStatement();
            return statement.executeQuery(query);
        } catch (SQLException e) {
            log.error(e.getMessage());
        }
        return null;
    }

    public void close() {
        try {
            if (!Objects.isNull(connection))
                connection.close();
        } catch (SQLException e) {
            log.error(e.getMessage());
        }
    }
}
