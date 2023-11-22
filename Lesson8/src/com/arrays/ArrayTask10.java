package com.arrays;
import java.util.Scanner;
public class ArrayTask10 {
    public static void main(String[] args) {
        String[] names = {"Иван","Мария","Петр","Ольга","Анна"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя:");
        String name = sc.nextLine();
        sc.close();
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Индекс имени \"" + name + "\" в массиве:" + index);
        } else {
            System.out.println("Имя \"" + name + "\" отсутсвует в массиве");
        }
    }
}
