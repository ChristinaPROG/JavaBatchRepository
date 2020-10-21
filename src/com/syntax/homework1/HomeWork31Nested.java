package com.syntax.homework1;

import java.util.Scanner;

public class HomeWork31Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Is it sunny outside?");
		
		
		boolean isSunny=true;
		
		
		
		if (isSunny) {
		    System.out.println("It is a sunny day, I should go somewhere!");
		    System.out.println("What is the temperature outside?");
  		  int temperature=scan.nextInt();
  			
  			if (temperature>85) {
  				System.out.println("I am going to the beach!");
  			}else {
  				System.out.println("I am going to the park!");
  			}
		}else {
			System.out.println("I stay home and practice Java!");
		}
	}
}





	