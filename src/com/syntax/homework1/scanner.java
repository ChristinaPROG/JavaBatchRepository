package com.syntax.homework1;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		int num= 18;
		int num2= 17;
		System.out.println("Enter your age");
		int age = scan.nextInt();	
		
		if (age>=18) {
			System.out.println("You are eligible to vote");
		
		}else if (age<17) {
		System.out.println("You not are eligible to vote");		 
		
		
		
		}

	     
	}

	public static int nextLine() {
		// TODO Auto-generated method stub
		return 0;
	}

}
