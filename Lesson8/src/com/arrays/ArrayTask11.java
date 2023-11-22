package com.arrays;

public class ArrayTask11 {
    public static void main(String[] args) {
        int numbers[]= {1,2,3,4,5};
        System.out.print("Исходный массив: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); // Перевод строки для чистоты вывода

        // Создаем новый массив для хранения элементов в обратном порядке
        int[] reversedNumbers = new int[numbers.length];

        // Копируем элементы из исходного массива в новый массив в обратном порядке
        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[i] = numbers[numbers.length - 1 - i];
        }

        System.out.print("Массив в обратном порядке: ");
        for (int i = 0; i < reversedNumbers.length; i++) {
            System.out.print(reversedNumbers[i]);
            if (i < reversedNumbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
