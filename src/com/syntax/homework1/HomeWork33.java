package com.syntax.homework1;

import java.util.Scanner;

public class HomeWork33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter a number");
	String	num=scan.next();
		
		
	
		
		
		if (num) {
		    System.out.println("Value is odd");
		     		  int temperature=scan.nextInt();
  			
  			if (temperature>85) {
  				System.out.println("Value is even");
  				 System.out.println("Even value is just right");
  			}else {
  				System.out.println("I am going to the park!");
  			}
		}else {
			System.out.println("I stay home and practice Java!");
		}
	}
}


