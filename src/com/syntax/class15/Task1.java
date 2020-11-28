package com.syntax.class15;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        String firstM, secondM, expect;
        Scanner inpu = new Scanner ( System.in );
        System.out.println ( "Enter mom's first name:" );
        firstM = inpu.nextLine ( );
        System.out.println ( "Enter dad's first name:" );
        secondM = inpu.nextLine ( );
        System.out.println ( "Are you expecting boy or girl?" );
        expect = inpu.nextLine ( );
        if ( expect.equalsIgnoreCase ( "boy" ) ) {
            System.out.println ( "Suggested name: " + secondM.substring ( 0, 3 ) + firstM.substring ( firstM.length ( ) - 2 ) );
        } else if ( expect.equalsIgnoreCase ( "girl" ) ) {
            System.out.println ( "Suggested name: " + firstM.substring ( 0, 3 ) + secondM.substring ( secondM.length ( ) - 2 ) );
        }
    }
}

