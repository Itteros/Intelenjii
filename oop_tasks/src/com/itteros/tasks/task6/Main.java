package com.itteros.tasks.task6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner names = new Scanner(System.in);
        System.out.println("Введите фамилию:");
        String secondName = names.nextLine();
        System.out.println("Введите имя:");
        String name = names.nextLine();
        System.out.println("Введите отчество:");
        String thirdName = names.nextLine();
        BankAccount bankAccount = new BankAccount(secondName, name, thirdName);
        System.out.println("Карта успешно создана");
        Scanner menuNumber = new Scanner(System.in);
        Scanner amount = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Меню:");
            System.out.println("1. Посмотреть информацию карты");
            System.out.println("2. Пополнить счет");
            System.out.println("3. Проверить счет");
            System.out.println("4. Снять со счета");
            System.out.println("5. Выход");
            System.out.print("Выберите действие: ");
            choice = menuNumber.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Вы выбрали Посмотреть информацию карты");
                    bankAccount.getInfo();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Вы выбрали Пополнить счет");
                    System.out.println("Введите суму пополнения:");
                    bankAccount.deposite(amount.nextDouble());
                    break;
                case 3:
                    System.out.println("Вы выбрали Проверить счет");
                    System.out.println("На вашем счету: " + bankAccount.checkBalance() + " UAH");
                    break;
                case 4:
                    System.out.println("Вы выбрали Снять со счета");
                    System.out.println("Введите суму которую хотите снять со счета:");
                    bankAccount.withdraw(amount.nextDouble());
                    break;
                case 5:
                    System.out.println("Программа завершена");
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
                    break;
            }
        } while (choice != 5);

        names.close();
        amount.close();
        menuNumber.close();
    }
}
