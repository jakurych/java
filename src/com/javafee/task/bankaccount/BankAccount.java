package src.com.javafee.task.bankaccount;


public class BankAccount {


    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void withdraw(double withdraw_anmount) {
        balance -= withdraw_anmount;

    }

    void withdraw(int percentage) {
        double percent = Double.parseDouble(String.valueOf(percentage)) / 100.0;
        double amount = balance * percent;
        this.withdraw(amount);
    }

    void transfer(double amount) {
        balance += amount;

    }
}
