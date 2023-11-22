package com.itteros.tasks.task3;

public class SavingsAccounts extends BankAccount{
    public SavingsAccounts(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    void withdraw(int amount) {
        if (getBalance() - amount < 100) {
            System.out.println("Minimum balance of $100 required!");
        } else {
            super.withdraw(amount);
        }
    }
}
