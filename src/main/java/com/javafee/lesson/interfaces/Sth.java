package com.javafee.lesson.interfaces;

public class Sth extends Base implements A, B {
    @Override
    public void iA() {
        System.out.println("Sth iA");
    }

    @Override
    public void iB() {
        System.out.println("Sth iB");
    }

    @Override
    public void test() {
        System.out.println("test from sth");
    }

    public void testB() {
        System.out.println("testB from sth1");
    }

}
