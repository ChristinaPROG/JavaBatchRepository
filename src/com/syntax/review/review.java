package com.syntax.review;

import java.util.Scanner;

public class review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////Switch Statements ///
		int num1;
		int num2;
		char operation;
		int results;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter two numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		System.out.println("Please enter the operation +_-/*");
		operation=scan.next().charAt(0);/// 0 captures the first character
		
		if (operation=='+') {
		results=num1+num2;
		
		}else if(operation=='-') {
			results=num1-num2;	}
		
	}else if(operation=='*') {
			results =num1 * num2;	
       
	}else if(operation=='/')  
        	results=num1/num2;	

}
}