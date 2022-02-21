package com.javafee.lesson.statics;

public class Main {
    public static void main(String[] args) {
        TShirt t1 = new TShirt("t1");
        System.out.println(TShirt.getCounter()); //1

        TShirt t2 = new TShirt("t2");
        System.out.println(TShirt.getCounter()); //2

        //metoda1();

    }

}
