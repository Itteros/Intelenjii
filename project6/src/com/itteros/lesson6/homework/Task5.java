package com.itteros.lesson6.homework;

public class Task5 {

    public static void main(String[] args) {
        int population =  10000000;
        int deaths = 8;
        int borns = 14;
        int dif = borns - deaths;
        int i = 1;
        while ( i <= 10 ) {
            i++;
            population += population * dif / 1000;
    }
        System.out.println(population);

//    public static int smert(int value) {
//        int result = value;
//        int peoples =  10000000;
//        int deaths = 8;
//        int population = 1000;
//        int borns = 14;
//        int years = 2020;
//        while ( years >= 2030 ) {
//            years++;
//            population += borns -= deaths;
//
//        }
//        return result;
    }

}
