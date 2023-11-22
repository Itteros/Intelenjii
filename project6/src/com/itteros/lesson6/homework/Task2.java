package com.itteros.lesson6.homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input threshold: ");
        int threshold = scanner.nextInt();

        System.out.println("Sum digits: " + finabochi(threshold));
    }
    // 0,1 1,2 3,4 7,8 15,16
    public static int finabochi(int threshold) {
        int first = 0;
        int second = 1;
        while (second < threshold) {
            System.out.println(second);
            int next = first + second;
            first = second;
            second = next;
        }
        return threshold;
    }
}
