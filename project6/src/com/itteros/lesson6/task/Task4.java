package com.itteros.lesson6.task;

public class Task4 {

    public static void main(String[] args) {
        int value = 13;
        boolean result = isSimple(value);
        System.out.println(result);
//        boolean result2 = simpleIs(value);
//        System.out.println(result2);
    }
//    public static boolean simpleIs(int value) {
//        boolean result = true;
//        int i = 2;
//        while (i < value) {
//            i++;
//            if (value % i ==0) {
//                result = false;
//                break;
//            }
//        }
//        return result;
//    }
    public static boolean isSimple(int value) {

        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }

        return true;
    }
}
