package src.com.javafee.lesson.inheritance.bank;

public class BaseAccount {
    private Double balance = 0.0;

    public BaseAccount() {
        this.checkProcess();
    }

    public void withdraw(Double amount) {
        this.balance -= amount;
    }

    public void transfer(Double amount) {
        this.balance += amount;
    }

    public void checkProcess() {
        System.out.println("Checking process");
    }

    public String getName() {
       return "BaseAccount";
    }
}
