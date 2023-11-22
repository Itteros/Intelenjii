package com.arrays;

public class ArrayTask15 {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 11, 5, 1, 20, 4};
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
            min = numbers[i];
            }
        }
        System.out.println(min);
    }
}
