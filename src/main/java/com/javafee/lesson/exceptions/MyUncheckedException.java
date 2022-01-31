package com.javafee.lesson.exceptions;

public class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String str) {
        super("Hello from my unchecked: " + str);
    }
}
