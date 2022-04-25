package com.javafee.myplanner.back.domain;

import lombok.Builder;

import java.util.Date;

@Builder
public class Reservation {
    //TODO: fill the properties and other

    private String name;
    private String surname;
    private String pesel;
    private String docNumber;
    private String bookTitle;
    private String isbnNumber;
    private String inventoryNumber;
    private String title;
    private Date lendDate;
    private Date returnedDate;
}
