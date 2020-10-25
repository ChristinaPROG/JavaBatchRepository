package com.syntax.class11;

public class GroupTask8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[][] array = { { 24, 45, 34, 48 }, { 86, 90, 55, 75 }, { 224, 453, 68, 100 } };
		int arraysize = array.length;
		int sum = 0;
		for (int i = 0; i < arraysize; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if ((array[i][j]) % 2 != 0) {
					sum += array[i][j];
					
				}
			}
		
	}
		System.out.println("sum of odd number in array is :" + sum);
		
		
		System.out.println("------------------------------------------------------------------");	
		
		int[][] a = { {0, 1, -2, 3 }, { 4, -5 } };
		System.out.println(a.length);
		System.out.println("==================");//2
		int sum1 = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] % 2 != 0) {
					sum1 += a[i][j];
				}
			}
		}
		System.out.print("The total of odd numbers in this array is "+sum1);
		
	}
	}

