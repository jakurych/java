package com.javafee.lesson.exceptions;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void  main(String[] args) {
        //https://rollbar.com/blog/java-exceptions-hierarchy-explained/#
        C c  = new C();
        // Files.readAllLines(Paths.get("C:\fail")); // Java checked exc - IOException
        D d = new D();
        d.d(); // wlasny unchcecked - nie musimy wylapywac - unchecked to runtime exception
        // do unchecked nalezy Java Arithmetic exc
        try {
            c.cc(10);
            c.c();
        }   catch (BusinessException e) {
            e.printStackTrace();
        }   catch (ArithmeticException e) {
            System.err.println("Do not divide by 0!!!");
            e.printStackTrace();
        }
        System.out.println("aaa");

        //todo: lacznie wyjatkow
        // admin abstract and exception
    }
}
