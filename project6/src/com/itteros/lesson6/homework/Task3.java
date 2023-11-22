package com.itteros.lesson6.homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N days: ");
        int days = scanner.nextInt();

        printStatistics(days);
    }

    private static void printStatistics(int days) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < days; i++) {
            System.out.println("Input value for day " + (i + 1));
            int value = scanner.nextInt();
            sum += value;
            if (maxValue < value) {
                maxValue = value;
            }
        }
        System.out.println("Amount of days: " + days);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + ((double) sum / days));
        System.out.println("Max: " + maxValue);
    }
}

