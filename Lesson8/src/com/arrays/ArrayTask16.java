package com.arrays;

public class ArrayTask16 {
    public static void main(String[] args) {
        int[] numbers = {2, 10, 17, 20, 23};
        int res = 0;
        int number = 0;
        for (int i = 0; i < numbers.length; i++) {
            res += numbers[i];
            number++;
        }
        double a = res / number;
        System.out.println("Среднее значение элементов в массиве: " + a );
    }
}
