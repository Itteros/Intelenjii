package com.itteros.lesson6.task;

public class Task3 {
    public static void main(String[] args) {
        double soureSum = 24;
//        double result = sum(soureSum);
//        System.out.println(result);
        double result2 = sumWhile(soureSum);
        System.out.println(result2);
    }
    public static double sumWhile(double sourceSum) {
        double result = sourceSum;
        int year = 1626 + 1;
        while (year <= 2023) {
            year++;
            double percent = result * 0.05;
            result += percent;
            System.out.println(year + " : " + result);
        }
        return result;
    }
    public static double sum(double sourceSum) {
        double result = sourceSum;
        for (int year = 1626 + 1; year <= 2023 ; year++) {
        double percent = result * 0.05;
        result += percent;
            System.out.println(year + " : " + result);
        }
        return result;
    }
}
