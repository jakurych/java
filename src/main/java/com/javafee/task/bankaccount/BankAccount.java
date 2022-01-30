package com.javafee.task.bankaccount;

public class BankAccount {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void withdraw(double withdraw_anmount) {
        if (withdraw_anmount > balance) {
            System.err.println("Not enough money!");
            System.exit(11);
        } else {
            balance -= withdraw_anmount;
        }
    }

    void withdraw(int percentage) {
        if (percentage > 100) {
            System.err.println("More than 100%!");
            System.exit(0);
        }

        this.withdraw(balance * (Double.parseDouble(String.valueOf(percentage)) / 100.0));
    }

    void transfer(double amount) {
        balance += amount;
    }
}
