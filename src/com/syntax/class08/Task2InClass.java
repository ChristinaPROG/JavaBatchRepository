package com.syntax.class08;

import java.util.Scanner;

import com.syntax.homework1.scanner;

public class Task2InClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter what item you're buying and price.");
		String item=scan.nextLine();
		double price=scan.nextDouble();
		System.out.println("Please enter how much you will pay.");
		double payment=scan.nextDouble();
		double balance=price-payment;
		for (double a=payment; a<=price; a--) {
			if(payment!=price) {
				System.out.println("You owe "+balance);
				break;
		}else if(payment==price){
			System.out.println("Enjoy your "+item);
			break;
		}else if(payment>price){
			System.out.println("please enter valid range");
		}
	}
	}}
