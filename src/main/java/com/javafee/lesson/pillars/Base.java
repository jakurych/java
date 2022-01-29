package com.javafee.lesson.pillars;

public class Base {

    private int value;

    public void alert(){
        System.out.println("Alter from Base.java");
    }


    public void setValue(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }

    public void alertRCB(){
        System.out.println("Wiatr silny bardzo");
    }


}
