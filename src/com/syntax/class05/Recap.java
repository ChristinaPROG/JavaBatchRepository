package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scanner;
	scanner=new Scanner(System.in);
			
			//I want to capture sentence:		
	        String sentence=scanner.nextLine();	
			System.out.println("You entered sentence: "+sentence);
             
			//I want to capture a number
			int number=scanner.nextInt();			
			System.out.println("You entered number: "+number);
			
			// Iwant to capture a word
			System.out.println("Please enter any word");
			String word=scanner.next();
			System.out.println("You entered number:+word");
			
			//I want to capture 1 character
			System.out.println("Please enter any single character");
			char singleCharacter=scanner.next().charAt(0);
			System.out.println("You entered number:" + singleCharacter);
			
			// I want to capture 1 word 
			System.out.println("Please enter any word");
			String word=Scanner.next();
			System.out.println("Please enter any word"+word);
			
		
		
		
		
		
		
		
		
		
	}

}
