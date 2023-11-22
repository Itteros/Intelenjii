package com.arrays;

public class ArrayTasks {
    public static void main(String[] args) {
        int[] values = {1,2,3,4,5};
        arrayJopa(values);
        System.out.println();
        arrayJopaDva(values);
        System.out.println();
        arrayJopaTri(values);
    }
    public static void arrayJopa(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
    }
    public static void arrayJopaDva(int[] values) {
        for (int value : values) {
            System.out.print(value + " ");
        }
    }
    public static void arrayJopaTri(int[] values) {
        for (int i = values.length - 1; i >= 0 ; i--) {
            System.out.print(values[i] + " ");
        }
    }
}
