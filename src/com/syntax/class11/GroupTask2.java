package com.syntax.class11;

import java.util.Scanner;

public class GroupTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		boolean prime=true;
		String validate=null;
		Scanner input=new Scanner(System.in);
		System.out.println("please input number");
		num=input.nextInt();
			while(prime) {
				for(int i=2;i<=num;i++) {
			if (num%i==0 && num!=i) {
				prime=false;
				validate="is not prime";
				break;
			}else if(num==i){
				prime=false;
				validate="is prime";
				break;
			}else {
				prime=true;
			
				
			}
			System.out.println("-----------------------------------------------");
		}
				// Write a java program to check whether a given number is prime or not?
				// prime number is a whole number > 1 and divisible by 1 and itself
				// (2,3,5,7,11,13..)
				int remainder;
				boolean isPrime = true;
				int numberToCheck = 19;
				   // loop to check whether the number is divisible by any number other than 1 and itself
				for (int i = 2; i <= numberToCheck / 2; i++) {
					// numberToCheck is dived by itself
					remainder = numberToCheck % i;
					System.out.println(numberToCheck + " devided by " + i + " gives a reminder " + remainder);
					// if remainder=0 --> numberToCheck !prime --> break the loop. else continue
					if (remainder == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					System.out.println(numberToCheck +" is a Prime number");
				} else {
					System.out.println(numberToCheck + " is not a Prime number");
				}
			
			
			
			}
			
		
		
		
	}

}
