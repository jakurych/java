package com.javafee.lesson.inheritance.bank;

public class BankAccountPremium extends BaseAccount{
    @Override
    public void checkProcess() {
        // do nothing
    }

    @Override
    public String getName() {
        return "PremiumAccount";
    }
}
