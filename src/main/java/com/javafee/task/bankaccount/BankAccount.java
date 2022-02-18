package com.javafee.task.bankaccount;

public class BankAccount {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void withdraw(double withdraw_anmount) throws BankException {
        if (withdraw_anmount > balance) {
            throw new BankException("Not enough money!");
        } else {
            balance -= withdraw_anmount;
        }
    }

    void withdraw(int percentage) throws BankException {
        if (percentage > 100) {

            throw new BankException("More than 100%!");
        }

        this.withdraw(balance * (Double.parseDouble(String.valueOf(percentage)) / 100.0));
    }

    void transfer(double amount) {
        balance += amount;
    }
}
