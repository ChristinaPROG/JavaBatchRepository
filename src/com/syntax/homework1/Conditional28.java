package com.syntax.homework1;

import java.util.Scanner;

public class Conditional28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Please enter the length");
		int length = scan.nextInt();
		System.out.println("Please enter the width");
			int width = scan.nextInt();
		
			if (width==length){
				System.out.println("The shape of your object is square");
				
				}else if(width!=length) {
					System.out.println("The shape of your object is rectangle");
				}

				
	
	
		

	}

}
