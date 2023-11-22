package com.arrays;

public class ArrayTask4 {
    public static void main(String[] args) {
            int[] values = {1,2,0,5,6,4,10,3};
        System.out.println("max " + findMax(values));
        System.out.println("min " +findMin(values));
        System.out.println(sumCalculate(values));
    }

    public static int findMin(int[] values) {
        int minValue = values[0];
        int minIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (minValue> values[i]) {
                minValue = values[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int findMax(int[] values) {
        int maxIndex = 0;
        int maxValue = values[maxIndex];
        for (int i = 0; i < values.length; i++) {
            if(maxValue < values[i]) {
                maxValue = values[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static int sumCalculate(int[] values) {
        int minIndex = findMin(values);
        int maxIndex = findMax(values);
        if (minIndex>maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }
        int result = 0;
        for (int i = minIndex + 1; i < maxIndex ; i++) {
            result += values[i];
        }
        return result;
    }
}
