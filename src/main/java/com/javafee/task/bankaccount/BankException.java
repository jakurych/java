package com.javafee.task.bankaccount;

public class BankException extends Exception{

    public BankException(String message){
        System.err.println(message);
    }

    @Override
    public String getMessage() {
        return "Spróbuj ponownie";
    }
}
