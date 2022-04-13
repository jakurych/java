package com.javafee.myplanner.back.infrastructure.jdbcdao.elibintegration;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ELibDBProperties {
    public String HOST = "ec2-54-247-96-153.eu-west-1.compute.amazonaws.com";
    public String PORT = "5432";
    public String DB_NAME = "d444a9ca4lg0e9";
    public String DB_USER = "kufbphugmmbkry";
    public String DB_USER_PASSWORD = "c213129fabc109e6726f499ada481189fa216dd115a125e1884d02fac3c552cb";
    public String CONNECTION_STRING = String.format("jdbc:postgresql://%s:%s/%s?user=%s&password=%s",
            HOST, PORT, DB_NAME, DB_USER, DB_USER_PASSWORD);
}
