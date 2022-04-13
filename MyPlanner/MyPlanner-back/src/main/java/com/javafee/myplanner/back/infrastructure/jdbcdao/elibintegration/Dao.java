package com.javafee.myplanner.back.infrastructure.jdbcdao.elibintegration;

import java.sql.ResultSet;

public interface Dao {
    ResultSet executeQuery(String query);
}
