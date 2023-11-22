package com.itteros.tasks.task4;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Теперь создадим карточку");
        System.out.println("Введите номер карты и пин:");
        KyivSmart kyivSmart1 = new KyivSmart(scan.nextLine(),scan.nextLine());
        kyivSmart1.stateCard();
        System.out.println("Пополните карту:");
        kyivSmart1.replenishment(scan.nextInt());
        kyivSmart1.stateCard();
        System.out.println("Покупка 1 поездки == 8 UAH\nВведите количество поездок:");
        kyivSmart1.purchaseTrips(scan.nextInt());
        kyivSmart1.stateCard();
    }
}
