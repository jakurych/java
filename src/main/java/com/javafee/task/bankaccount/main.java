package com.javafee.task.bankaccount;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        BankAccount client = new BankAccount();
        BankAccountPremium clientPremium = new BankAccountPremium();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Is premium account? Type 0 or 1");
        int isPremium = scanner.nextInt();
        if (isPremium == 1) {
            System.out.println("Premium account");
            client = clientPremium;
        }
        System.out.println("Set balance: ");
        client.setBalance(scanner.nextDouble());
        System.out.println("Balance: " + client.getBalance());
        System.out.println("Input withdraw: (example: 10% or 10)");
        String withdrawAmount = scanner.next();
        if (withdrawAmount.endsWith("%")) {
            System.out.println("Percentage value: " + withdrawAmount);
            StringBuffer sb = new StringBuffer(withdrawAmount);
            sb.deleteCharAt(sb.length() - 1);
            client.withdraw(Integer.parseInt(String.valueOf(sb)));

        } else {
            client.withdraw(Integer.parseInt(withdrawAmount));
        }

        System.out.println(client.getBalance());

    }


}
