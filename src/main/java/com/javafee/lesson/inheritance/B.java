package com.javafee.lesson.inheritance;

public class B extends C {
    public B() {
        System.out.println("B created");
    }

    public B(String message) {
        super(message);
        System.out.println("B created: " + message);
    }

    public void b(){
    }
}
