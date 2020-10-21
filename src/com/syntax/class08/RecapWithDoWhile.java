package com.syntax.class08;

import java.util.Scanner;

public class RecapWithDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input;
		int money;
		int waterPrice=5;

		input= new Scanner(System.in);
		System.out.println("please pay for your water");
		//money=input.nextInt();
		
		do {
		
			money=input.nextInt();
			if (money>waterPrice) {
				System.out.println("This is too much, you need to enter less money");
		//money=input.nextInt();
			
			}else if (money<waterPrice) {
				System.out.println("Water is expensive, please insert more money");
				//money=input.nextInt();
			
			}
		
	
		} while (money!=waterPrice);
		
		System.out.println("Enjoy your water");
		}
	
	
	
	
	}


