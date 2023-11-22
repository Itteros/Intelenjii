package com.itteros.lesson7.sprint;
import java.util.Scanner;
public class Task5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Переводим в Градусы");
        System.out.print("Введите Радианы:");
        double radians = sc.nextFloat();
        double pi = Math.PI;
        int degrees = (int) (radians * (180 / pi));
        System.out.println(radians + " Радианов это " + degrees + " Градусов");
    }
}
