package com.itteros.lesson10;

public class task1 {

    public static void main(String[] args) {
        String value = "asdas :( asdas :( asdas :) asdas :) asdas :(";
        String res = replace(value);
        System.out.println(res);

    }

    public static String replace(String value) {
        return  value.replace(":(", ":)");
    }
}
