package com.arrays;

public class ArrayJopa {
    public static void main(String[] args) {
        int[] values = new int [10];
        values[2] = 5;
        values[7] = 3;
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
    }
}
