package com.javafee.lesson.pillars;

public class Subclass extends Base{

    public void alert(){
        System.out.println("Alter from Subclass.java");
    }
    public void alertRCB(){
        super.alertRCB();
        System.out.println("Deszcz silny bardzo");
    }

}
