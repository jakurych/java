package com.javafee.task.bankaccount;

public class BankAccountPremium extends BankAccount {

    void withdraw(double withdraw_anmount) {
        super.withdraw(withdraw_anmount);
        super.transfer(withdraw_anmount / 100); //super
    }

    void withdraw(int percentage) {
        super.withdraw(getBalance() * (Double.parseDouble(String.valueOf(percentage)) / 100.0));
        super.transfer(getBalance() * (Double.parseDouble(String.valueOf(percentage)) / 10000)); //super
    }

}
