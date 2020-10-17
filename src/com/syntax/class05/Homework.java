package com.syntax.class05;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
	    int a=10;
		int b;
	    b=90;
	
		Scanner scan;
		String answer;
		double balance;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter if you have a credit card( true/false)");
		
	
		answer=scan.next();
		
		if (answer.equals("yes"))  {
			System.out.println("What is the balance on your card?");
			balance = scan.nextDouble();
			if(balance>1000) {
				System.out.println("Please pay off your credit card");
	}else {
		System.out.println("You can spend more $$$$");
	}
	}else {
			}
		System.out.println("Would like to get a credit card?");
		
		
	}
	}






