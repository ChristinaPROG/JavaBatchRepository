package com.syntax.class16;

public class TaskHW {
    public static void main(String[] args) {
        String forReverse = "Hello every one from sunny Florida!"; // ----- 1st task
        for (int i = (forReverse.length() - 1); i >= 0; i--) {
            System.out.print(forReverse.charAt(i));
        }
        System.out.println();
        String[] parts = forReverse.split(" "); // ----- 2nd task
        for (int x = (parts.length - 1); x >= 0; x--) {
            System.out.print(parts[x] + " ");
        }
        System.out.println();
        String palindrome1 = forReverse.replaceAll("[^a-zA-Z0-9]",""); // ----- 3rd task
        String palindrome2 = "";
        for (int c = (palindrome1.length() - 1); c >= 0; c--) {
            palindrome2 += palindrome1.charAt(c);
        }
        if (palindrome1.equalsIgnoreCase(palindrome2)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome"); }
        String one ="one"; // ----- 4th task
        String two = "two";
        one = one+two;
        two = one.substring(0,(one.length()-two.length()));
        one = one.substring(two.length());
        System.out.println(one);
        System.out.println(two);
    }
}

