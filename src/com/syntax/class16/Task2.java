package com.syntax.class16;

public class Task2 {
    public static int largest(int num1, int num2) {
        if ( num1 > num2 ) {
            return num1;
        } else if ( num2 > num1 ) {
            return num2;
        } else {
            return 0;
        }
    }

    public static String evenOdd(int num) {
        if ( num % 2 == 00 ) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static boolean isPalindrome(String str) {
        String[] arr = str.split ( "\\s" );
        String reversed = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            reversed += " " + arr[i];
        }
        return str.equals ( reversed );
    }

    public static String translate(String language) {
        language = language.toLowerCase ( );
        switch (language) {
            case "english":
                return "Hello";
            case "chinese":
                return "你好";
            case "bulgarian":
                return "Здравейте";
            case "danish":
                return "Hej";
            default:
                return "That language is not in the system";
        }
    }
}