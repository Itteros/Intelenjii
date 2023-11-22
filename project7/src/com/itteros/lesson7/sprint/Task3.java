package com.itteros.lesson7.sprint;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Conversion to degrees Celsius or Fahrenheit: ");
        String type = sc.nextLine();
        if(type.equals("Fahrenheit") || type.equals("fahrenheit" )) {
            System.out.println("Enter degrees Celsius: ");
            float celsius = sc.nextInt();
            float fahrenheit = (9/5) * celsius + 32;
            System.out.println(celsius + " degrees Celsius: " + fahrenheit + " degrees Fahrenheit");
        } else if (type.equals("Celsius") || type.equals("celsius")) {
            System.out.println("Enter degrees Fahrenheit: ");
            float fahrenheit = sc.nextInt();
            float celsius = (5/9) * (fahrenheit - 32);
            System.out.println(fahrenheit + " degrees Fahrenheit: " + celsius + " degrees Celsius");
        } else {
            System.out.println("Try once more");
        }
    }
}
