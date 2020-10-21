package com.syntax.class08;

import java.util.Scanner;

import com.syntax.homework1.scanner;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input;
int money;
int waterPrice=5;

input= new Scanner(System.in);
System.out.println("please pay for your water");
money=input.nextInt();


	while(money!=waterPrice) { // not equals
		if (money>waterPrice) {
			System.out.println("This is too much, you need to enter less money");
	//money=input.nextInt();
		
		}else {
			System.out.println("Water is expensive, please insert more money");
			//money=input.nextInt();
		
		}
		money=input.nextInt();
	}
	

System.out.println("Enjoy your water");




	}

}
