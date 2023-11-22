package itteros.task;

/**
 * 2.Дано целое число. Определить, является ли послядняя цифра этого числа - цифро 3.
 */
public class Task2 {

    public static void main(String[] args) {
//        912312
        int value = 912313;
        if ( value % 10 == 3) {
            System.out.println("Последняя цифра числа является 3");
        }
    }
}
