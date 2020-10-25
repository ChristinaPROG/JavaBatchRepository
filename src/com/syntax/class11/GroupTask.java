package com.syntax.class11;

import java.util.Scanner;

public class GroupTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 20;
		x = x + y;
		y = x - y;
		x = x - y;
		// System.out.println("After swap:");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);
	
		System.out.println("-------------------------------------------------------------------");	
		
		String a = "my";
		String b = "name";
		System.out.println("Before swap: " + a + " " + b);
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("After : " + a + " " + b);
		
	}
}
