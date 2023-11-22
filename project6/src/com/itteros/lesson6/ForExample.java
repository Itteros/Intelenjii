package com.itteros.lesson6;

public class ForExample {

    public static void main(String[] args) {
        for (int value = 10; value > 0; value--) {
            if (value == 5 || value == 6 || value == 7) {
                continue;
//                break;
            }
            System.out.println(value);
        }
    }
    private static void forExample() {
        int i = 0;
        for (; ; ) {
            System.out.println(i);
        }
//        for (int value = 10; value > 0; value--) {
//            System.out.println(value);
//        }
    }
}
