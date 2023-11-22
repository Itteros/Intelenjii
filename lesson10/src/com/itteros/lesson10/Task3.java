package com.itteros.lesson10;

public class Task3 {
    public static void main(String[] args) {
        String firstName = "Igor";
        String secondName = "Shamanskyi";
        String thirdName = "Denisovich";
        String res = FST(firstName,secondName,thirdName);
        System.out.println(res);
    }

    public static String FST(String firstName, String secondName, String thirdName) {
//        char firstNameChar = firstName.toUpperCase().charAt(0);
//        char secondNameChar = secondName.toUpperCase().charAt(0);
//        char thirdNameChar = thirdName.toUpperCase().charAt(0);
        char firstNameChar =Character.toUpperCase( firstName.charAt(0));
        char secondNameChar = Character.toUpperCase(secondName.charAt(0));
        char thirdNameChar = Character.toUpperCase(thirdName.charAt(0));
//        return firstNameChar + "." + secondNameChar + "." + thirdNameChar;
        return String.format("%s.%s.%s", firstNameChar, secondNameChar, thirdNameChar);
    }
}
