package com.itteros.lesson6.task;

public class ReccursionExample {

    public static void main(String[] args) {
        int factorial = factroial(5);
        System.out.println(factorial);
    }
    public static int factroial(int value) {
        if (value == 1) {
            return  1;
        }
        return value * factroial(value - 1);
    }
}
