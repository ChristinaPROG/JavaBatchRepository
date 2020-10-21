package com.syntax.class06;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan;
		String name;
		
		scan=new Scanner(System.in);
		
		int number=1;
		
		while(number<=5) {
		System.out.println("Please tell me your name");
		name=scan.nextLine();
		System.out.println("Nice to meet you " +name);
		number++;
		
		
		
	}

}}
