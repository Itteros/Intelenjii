package com.itteros.tasks.task4;

public class KyivSmart {

    private double balance;
    private String cardNumber;
    private String pin;

    private int trips;

    public KyivSmart(String cardNumber, String pin) {
        this.cardNumber=cardNumber;
        this.pin=pin;
    }

    void stateCard() {
        System.out.println("Баланс карты:"+cardNumber + "\n" + balance + " UAH || "+ trips +" поездок");
    }

    void replenishment(int amount) {
        balance += amount;
    }

    void purchaseTrips(int amount) {
        int price = 8;
        for (int i = 0; i < amount; i++) {
            if (7<=balance) {
                balance -= price;
                trips++;
            } else {
                System.out.println("Недостаточно средств");
                break;
            }
        }
    }
}
