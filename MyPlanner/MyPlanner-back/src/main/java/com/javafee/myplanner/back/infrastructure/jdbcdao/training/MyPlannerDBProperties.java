package com.javafee.myplanner.back.infrastructure.jdbcdao.training;

import lombok.experimental.UtilityClass;

@UtilityClass
public class MyPlannerDBProperties {
    public String HOST = "localhost";
    public String PORT = "5432";
    public String DB_NAME = "your-planner";
    public String DB_USER = "postgres";
    public String DB_USER_PASSWORD = "admin123";
    public String CONNECTION_STRING = String.format("jdbc:postgresql://%s:%s/%s?user=%s&password=%s",
            HOST, PORT, DB_NAME, DB_USER, DB_USER_PASSWORD);
}
