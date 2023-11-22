package com.itteros.lesson10;

public class Task4 {

    public static void main(String[] args) {
        String value = "sadasa.,!sdasas,.> gtwef,.!?";
        int res = countSymbols(value);
        System.out.println(res);
    }

    public static int countSymbols(String value) {
        String result = value.replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return value.length() - result.length();
    }
}
