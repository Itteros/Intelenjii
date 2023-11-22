package com.itteros.lesson6.homework;

import java.util.Scanner;
import java.util.SortedMap;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value: ");
        int value = scanner.nextInt();

        System.out.println("Sum digits: " + fullValue(value));
//        int value = 12345;
//        int result = fullValue(value);
//        System.out.println(result);
//        int result2 = fullValueWhile(value);
//        System.out.println(result2);
    }
    public static int fullValue(int value) {
        int result = 0;
        for (int currentValue = value; currentValue != 0  ; currentValue /= 10) {
            result += currentValue % 10;
            
        }
        return result;
    }
    public static int fullValueWhile(int value) {
        int result = 0;
        int currentValue = value;
        while (currentValue != 0) {
            result += currentValue % 10;
            currentValue /= 10;
        }
        return result;
    }
}
