package com.syntax.class19;

public class RecapTask3 {

    private static String vowelsOnly(String name) {
    return name.replaceAll("[^AEIOUaeiou]", "");


    }

    public static void main(String[] args) {
        System.out.println (vowelsOnly("all the vowels will be removed"));
    }
}
