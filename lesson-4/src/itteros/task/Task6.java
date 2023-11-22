package itteros.task;

public class Task6 {

    public static void main(String[] args) {

        int day = 1;
        if ( day == 1 ) {
            System.out.println("Понедельник");
        } else if ( day == 2) {
            System.out.println("Вторник");
        }
        else if ( day == 3) {
            System.out.println("Среда");
        }
        else if ( day == 4) {
            System.out.println("Четверг");
        }
        else if ( day == 5) {
            System.out.println("Пятница");
        }
        else if ( day == 6 || day == 7) {
            System.out.println("Выходные");
        } else {
            System.out.println("Данные введены некоректно");
        }
    }
}
