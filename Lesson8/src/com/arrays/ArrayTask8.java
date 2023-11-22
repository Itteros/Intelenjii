package com.arrays;

public class ArrayTask8 {
    public static void main(String[] args) {
        int[] values = {1,6,3,6,1,7,33};
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
            System.out.println(sum);
        }
    }
}
