package com.javafee.lesson.interfaces;

public class Main {
    public static void main(String[] args) {
        A a = new Sth();
        A b = new Sth1();
        B c = new Sth();
        DoSth doSth = new DoSth();
        doSth.doIt(a);
        doSth.doIt(b);
        a.test();
        b.test();
    }
}
