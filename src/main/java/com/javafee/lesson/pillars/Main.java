package com.javafee.lesson.pillars;

public class Main {

    public static void main(String[] args) {

        Base base = new Base();
        Subclass subclass = new Subclass();

        System.out.println("Dziedziczenie:");
        subclass.alert();
        System.out.println("Enkapsulacja:");
        base.setValue(29);
        System.out.println(base.getValue());
        System.out.println("Polimorfizm:");

        Base subclass1 = new Subclass1();
        Base subclass0 = new Subclass(); //klasa nadrzedna = new klasa imlementująca
        subclass1.alert();

        System.out.println("Overriding:");
        subclass.alertRCB();
        // super.alertRCB();
        System.out.println("Overloading:");
        //wpierw rzutowanie
        ((Subclass1)subclass1).alertRGB(1);// rzutowaliśmy typ base na subclass1, w danej linii kodu
        ((Subclass1)subclass1).alertRGB('g');


    }

}
