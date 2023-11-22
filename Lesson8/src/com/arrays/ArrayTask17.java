package com.arrays;

public class ArrayTask17 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 35, 40, 50};

        System.out.print("Элементы, делящиеся на 10 без остатка: ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 10 == 0) {
                System.out.print(numbers[i]);
                if (i < numbers.length - 1) {
                    System.out.print(", ");
                }
            }
        }

        System.out.println(); // Добавляем перевод строки для чистоты вывода
    }
}
