package com.itteros.tasks.task6;

public class BankAccount {
    private String name;
    private String secondName;
    private String thirdName;
    private String cardNumber;
    private int cvv;
    private double balance;


    public BankAccount(String secondName, String name, String thirdName) {
        this.name=name;
        this.secondName=secondName;
        this.thirdName=thirdName;
        cardNumber = "4441 " + (int) (1000 + Math.random() * 4000) + " " + (int) (1000 + Math.random() * 4000) + " " + (int) (1000 + Math.random() * 7000);
        cvv = (int) (100 +Math.random() * 1000);

    }

    void getInfo() {
        char nameChar = Character.toUpperCase(name.charAt(0));
        char secondNameChar = Character.toUpperCase(secondName.charAt(0));
        char thirdNameChar = Character.toUpperCase(thirdName.charAt(0));
        System.out.println("Ф.И.О владельца: " +secondNameChar + "." + nameChar + "." + thirdNameChar +"\nНомер карты:" + cardNumber);
        System.out.println("Дата: 10/27 || CVV: " + cvv + " || Баланс: " + balance + " UAH");
    }

    double checkBalance() {
        return balance;
    }
    double deposite(double amount) {
        balance += amount;
        return balance;
    }

    void withdraw(double amount) {
        if (balance>= amount) {
            balance-=amount;
            System.out.println("На вашем счету осталось:" + checkBalance() + " UAH");
        } else {
            System.out.println("Недостаточно средств");
        }
    }
}
