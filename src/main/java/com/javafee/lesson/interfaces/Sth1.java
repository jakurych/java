package com.javafee.lesson.interfaces;

public class Sth1 implements A, B {
    @Override
    public void iA() {
        System.out.println("Sth1 iA");
    }

    @Override
    public void iB() {
        System.out.println("Sth1 iB");
    }

    public void test() {
        System.out.println("test from sth1");
    }

    public void testB() {
        System.out.println("testB from sth1");
    }

}
