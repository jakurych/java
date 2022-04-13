package com.javafee.myplanner.back.infrastructure.jdbcdao.training;

import java.sql.ResultSet;

public interface Dao {
    ResultSet executeQuery(String query);
}
