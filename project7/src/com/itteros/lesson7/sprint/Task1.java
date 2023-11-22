package com.itteros.lesson7.sprint;

public class Task1 {
    public static void main(String[] args) {
        double pi, radius;
        pi = 3.14159265;
        radius = 5.5;
        float perimeter = (float)(2 * radius * pi);
        float area = (float) (radius * radius * pi);
        System.out.println("For circle radius 5.5 area is " + (int)area + " and perimeter is " + (int)perimeter );

    }
}
