package com.javafee.lesson.exceptions.training;

public class Subclass extends Class{


    int exception=88;

    public Subclass(){

        if(exception == 88){
            try {
                throw new MyOwnException("Niedozwolona wartość 88!");
            } catch (MyOwnException e) {
                System.out.println("CATCH block");
            }
        }else{
            super.metoda();
        }


    }
}
