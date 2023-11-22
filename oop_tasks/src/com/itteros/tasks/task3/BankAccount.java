package com.itteros.tasks.task3;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposite(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance>= amount) {
            balance-=amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}
