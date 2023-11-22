package com.arrays;

import java.util.Random;

public class ArrayTask5 {
    public static void main(String[] args) {
        int[] randomNumbers = new int[15];
        int[] negativeNumbers;
        int[] positiveOrZeroNumbers;

        Random random = new Random();

        // Заповнюємо масив випадковими числами в діапазоні від -20 до 19
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(40) - 20;
        }

        // Рахуємо кількість від'ємних і додатних чисел (включаючи нуль)
        int negativeCount = 0;
        int positiveOrZeroCount = 0;

        for (int num : randomNumbers) {
            if (num < 0) {
                negativeCount++;
            } else {
                positiveOrZeroCount++;
            }
        }

        // Ініціалізуємо масиви для від'ємних і додатних чисел
        negativeNumbers = new int[negativeCount];
        positiveOrZeroNumbers = new int[positiveOrZeroCount];

        int negativeIndex = 0;
        int positiveOrZeroIndex = 0;

        // Розділяємо числа на два окремих масиви
        for (int num : randomNumbers) {
            if (num < 0) {
                negativeNumbers[negativeIndex] = num;
                negativeIndex++;
            } else {
                positiveOrZeroNumbers[positiveOrZeroIndex] = num;
                positiveOrZeroIndex++;
            }
        }

        // Виводимо обидва масиви на екран
        System.out.print("Масив від'ємних чисел: ");
        for (int num : negativeNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Масив додатних або нульових чисел: ");
        for (int num : positiveOrZeroNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
