package com.syntax.homework1;

import java.util.Scanner;

public class Homework34 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan;
		int num1, num2, num3;
		int largest;
		scan = new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		if (num1 >= num2) {
			if (num1 > num3) {
				largest = num1;
			} else {
				largest = num3;
			}
		} else {
			if (num2 >= num3) {
				largest = num2;
			} else {
				largest = num3;
			}
		}
		System.out.println("The largest number is " + largest);
	}

}
