package com.arrays;

public class ArrayTask9 {
    public static void main(String[] args) {
        int[] numbers = {5,10,15,20,25,30,35};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 5 == 0) {
                System.out.println(numbers[i]);
            } else if (numbers[i] % 5 != 0) {
                System.out.println("pizdec");
            }
        }
    }
}
