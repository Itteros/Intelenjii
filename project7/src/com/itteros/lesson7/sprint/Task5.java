package com.itteros.lesson7.sprint;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.println("Переводим в градусы или радианы?");
        String type = temp.nextLine();
        if (type.equals("Радианы") || type.equals("радианы")) {
            System.out.println("Введите градусы:");
            double degrees = temp.nextDouble();
            double pi = Math.PI;
            double radians = degrees * (pi / 180);
            System.out.println(degrees + " Градусов это " + radians + " Радианов");
        } else if (type.equals("Градусы") || type.equals("градусы")) {
            System.out.println("Введите радианы:");
            double radians = temp.nextFloat();
            double pi = Math.PI;
            double degrees = radians * (180 / pi);
            System.out.println(radians + " Радианов это " + degrees + " Градусов");
        }
    }
}
