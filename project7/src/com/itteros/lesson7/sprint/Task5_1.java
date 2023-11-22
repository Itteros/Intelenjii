package com.itteros.lesson7.sprint;
import java.util.Scanner;
public class Task5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Переводим в Радианы");
        System.out.print("Введите Градусы:");
        double degrees = sc.nextDouble();
        double pi = Math.PI;
        double radians = degrees * (pi / 180);
        System.out.println(degrees + " Градусов это " + radians + " Радианов");

    }
}
