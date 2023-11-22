package com.itteros.lesson6.homework;
import java.util.Scanner;
public class Ghoul {
    public static void main(String[] args) {
        System.out.println("Ты гуль? ");
        Scanner ghoul = new Scanner(System.in);
        String ghoul1 = ghoul.nextLine();
        if (ghoul1 =="Да") {
            for (int i = 1000; i > 0; i -= 7) {
                System.out.println(i);
            }
        }else if (ghoul1 =="Нет") {
            System.out.println("Подумай еще раз");
        }
    }
}
