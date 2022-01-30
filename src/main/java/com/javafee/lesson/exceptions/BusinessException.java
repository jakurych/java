package com.javafee.lesson.exceptions;

public class BusinessException extends Exception {
    public BusinessException(String message) {
        super("Business exception occurred: " + message);
    }
}
