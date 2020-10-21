package com.syntax.class06;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan;
		int numberFromUser;
		
		int luckyNumber=7;
		
		scan=new Scanner(System.in);
		
		do { 
		System.out.println("Please enter any number from 1 to 100");
		numberFromUser=scan.nextInt();
		
		}while(numberFromUser!=luckyNumber);
		System.out.println("You guessed the number right");
		
		
		
		
		
		
		
	}

}
