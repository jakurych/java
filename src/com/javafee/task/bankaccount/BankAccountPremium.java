package src.com.javafee.task.bankaccount;

public class BankAccountPremium extends BankAccount{

    void withdraw(double withdraw_anmount){
        super.withdraw(withdraw_anmount);
        double amountToReturn = withdraw_anmount / 100;
        super.transfer(amountToReturn); //super
    }
}
