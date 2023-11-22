package itteros.task;


public class Task4 {

    public static void main(String[] args) {
        int value = 2000;
        isLeapYear(value);


    }
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
//        if (result) {
//            return true;
//        } else {
//            return false;

    }
}
