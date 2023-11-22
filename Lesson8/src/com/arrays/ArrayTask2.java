package com.arrays;

public class ArrayTask2 {
    public static void main(String[] args) {
        int[] values = new int[100];
        arrayVaxue(values);
        ArrayTasks.arrayJopa(values);
    }
    public static void arrayVaxue(int[] values) {
        int currentIndex = 0;
        for (int currentValue = 1; currentIndex < values.length; currentValue++) {
            if (currentValue % 13 == 0 || currentValue % 17 == 0) {
                values[currentIndex] = currentValue;
                currentIndex++;
            }
        }
    }
}
