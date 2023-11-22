package com.arrays;

public class ArrayTask12 {
    public static void main(String[] args) {
        int numbers[][] ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                sum += numbers.length;
            }
        }
        System.out.println(sum);
    }
}
