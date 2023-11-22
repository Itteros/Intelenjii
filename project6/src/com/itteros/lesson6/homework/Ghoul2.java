package com.itteros.lesson6.homework;
import java.util.Scanner;
public class Ghoul2 {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Ты гуль?");
//        String answer = scan.nextLine();
//        if (answer.equals("Да") || answer.equals("да")) {
//            int b = 7;
//            for (int a = 1000; a > 7 ; a -= b) {
//                System.out.print(a + " - 7 = ");
//                System.out.print(a);
//                System.out.println("");
//            }
//        } else {
//            System.out.println("Пидора ответ");
//        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Ты гуль?");
        String answer = scan.nextLine();
        if (answer.equals("Да") || answer.equals("да")) {
            int a = 1000;
            while (a > 7) {
                System.out.print(a + " - 7 = ");
                a -= 7;
                System.out.print(a);
                System.out.println("");
            }
        }else {
            System.out.println("мужик ты че ебнутый?");
        }
        }
    }

