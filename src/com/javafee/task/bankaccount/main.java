package src.com.javafee.task.bankaccount;

public class main {



    public static void main(String[] args) {
        BankAccount client = new BankAccount();
        BankAccountPremium clientPremium = new BankAccountPremium();

        client.setBalance(100);
        client.withdraw(10);

        clientPremium.setBalance(100);
        clientPremium.withdraw(10);

        System.out.println(client.getBalance());
        System.out.println(clientPremium.getBalance());

        client.transfer(10);
        clientPremium.transfer(10);

        System.out.println(client.getBalance());
        System.out.println(clientPremium.getBalance());

        client.withdraw(10);
        clientPremium.withdraw(10);

        System.out.println(client.getBalance());
        System.out.println(clientPremium.getBalance());

    }


}
