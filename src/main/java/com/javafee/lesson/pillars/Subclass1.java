package com.javafee.lesson.pillars;

public class Subclass1 extends Base{

    public void alert(){
        System.out.println("Alter from Subclass1.java");
    }

    public void alertRGB(char rgb){
        System.out.println(rgb);
        System.out.println("char");
    }
    public void alertRGB(int rgb){
        System.out.println(rgb);
        System.out.println("int");
    }

}
