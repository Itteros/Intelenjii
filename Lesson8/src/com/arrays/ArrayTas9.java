package com.arrays;

public class ArrayTas9 {
    public static void main(String[] args) {
        int value = 0;
        int index = 0;
        int values[] = {5,10,15,20,25};
        for (int i = 0; i < values.length; i++) {
            value += values[i];
            index++;
        }
        int avg = value / index;
        System.out.println(avg);
    }
}
