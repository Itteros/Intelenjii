package com.arrays;

public class ArrayTask6 {
    public static void main(String[] args) {
        int[] e6 = {3,4,5,7,9};
        int sum = 0;
        for (int i = 0; i < e6.length; i++) {
            sum = sum + e6[i];
        }
        double avg = sum / e6.length;
        System.out.println(avg);
    }
}
