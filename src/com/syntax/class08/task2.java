package com.syntax.class08;

import java.util.Scanner;

import com.syntax.homework1.scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
		    System.out.println("Please enter 2 number");
		    int start = scanner.nextInt();
		    int end = scanner.nextInt();
		    int sumEven = 0;
		    int sumOdd = 0;
		    for (int i = start; i <= end; i++) {
		        if (i%2 == 0) {
		            sumEven += i;
		        } else {
		            sumOdd += i;
		        }
		    }
		    System.out.println("The sum of even number from start to end that you entered is " + sumEven);
		    System.out.println("The sum of odd number from start to end that you entered is " + sumOdd);
	}

}
