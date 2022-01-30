package com.javafee.lesson.exceptions;

public class Main {
    public static void main(String[] args) {
        //https://rollbar.com/blog/java-exceptions-hierarchy-explained/#
        C c  = new C();
        try {
            c.cc(0);
            c.c();
        } catch (BusinessException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.err.println("Do not divide by 0!!!");
            e.printStackTrace();
        }
        System.out.println("aaa");

        //todo: lacznie wyjatkow
        // admin abstract and exception
    }
}
