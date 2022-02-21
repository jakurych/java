package com.javafee.lesson.statics;

public class TShirt {
    private static int counter = 0;
    private String name;

    public TShirt(String name) {
        this.name = name;
        counter++;
    }

    public static int getCounter() {
        //TShirt t3 = new TShirt("t3");
        // System.out.println(name);
        return counter;
    }
}
