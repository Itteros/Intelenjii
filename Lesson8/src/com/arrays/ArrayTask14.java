package com.arrays;

public class ArrayTask14 {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9,10,12,14,16,18};
        int colvo = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                colvo++;
            }
        }
        System.out.println("Количество четных чисел в массиве: " +colvo);
    }
}
