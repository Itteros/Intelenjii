package com.itteros.lesson6.task;
/*
1.Написать программу высчитывающую факториал введеного целого числа.
 */
public class Task1 {

    public static void main(String[] args) {
        int value = 10;
        int result = factorial(value);
        System.out.println(result);
        int result2 = factorialWhile(value);
        System.out.println(result2);

    }
    public static int factorialWhile(int value) {
        int result = 1;
        int i = 1;
        while ( i <= value) {
            result *= i;
            i++;
        }
        return result;
    }
    public static int factorial (int value) {
        int result = 1;
        for (int i = 1; i <= value ; i++) {
            result *= i; // result = result * i;
        }

        return result;
    }
}
