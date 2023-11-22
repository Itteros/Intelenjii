package com.itteros.lesson6.homework;

public class Task6 {

    public static void main(String[] args) {
        int born = 14;
        int death = 8;
        int population = 10000000;
        for (int i = 1; i < 10 ; i++) {
            if (born > 7) born -=1;
            if (death > 6) death-=1;
            population += population * (born - death) / 1000;
        }
        System.out.println(population);
    }
}
