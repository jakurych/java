package com.javafee.lesson.exceptions.training2;

//Create a class with a main( ) that throws an object of class Exception inside a try block.
// Give the constructor for Exception a String argument.
// Catch the exception inside a catch clause and print the String argument.
// Add a finally clause and print a message to prove you were there.

public class Main {

    public static void main(String[] args) throws Exception{


        String exceptionString = "Exception1 String argument";
        try{
            Exception exception1 = new Exception();
        }catch (Exception e){
            System.out.println(exceptionString);
        }

    }


}
