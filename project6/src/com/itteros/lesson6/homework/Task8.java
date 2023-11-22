package com.itteros.lesson6.homework;

public class Task8 {

    public static void main(String[] args) {
        int i, j, number = 6;

        System.out.println("Завдання 1");
        System.out.println("1)");
        for (i = 0; i < number; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
        System.out.println("\n2)");
        for(i = 0; i < number ; i++) {
            for(j = 0; j < number - i; j++) {
                System.out.print(".");
            }
            System.out.println();
        }

    }
}
