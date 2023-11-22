package com.itteros.lesson6.homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum = sum + i;
            
        }
        System.out.println(sum);
            
        }
//        for (int i = 1; i <= 10 ; i++) {
//            System.out.println("3*" + i + "=" + 3*i);

        }
//    }
//    public static int maxValue(int value    ) {
//        int result = 0;
//        for (int i = 1; i <= 5 ; i++) {
//
//        }
//        return result;


