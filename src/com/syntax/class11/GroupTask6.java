package com.syntax.class11;

public class GroupTask6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a 2D array to store numbers in 3 rows and 3 columns.
				// Print the sum of all numbers.
				int[][] values = { 
						{ 1, 2, 3 }, 
						{ 1, 2, 3 }, 
						{ 1, 2, 3 }
				};
				int sum = 0;
				for (int i = 0; i < values.length; i++) {
					for (int j = 0; j < values.length; j++) {
						sum += values[i][j];
					}
				}
				System.out.println("The sum is " + sum);
		

				System.out.println("------------------------------------------------------------------");	
				
	
	int[][] array = { { 69, 87, 43 }, { 23, 92, 32 }, { 132, 54, 45 } };
	int arraysize = array.length;
	int sum1 = 0;
	for (int i = 0; i < arraysize; i++) {
		for (int j = 0; j < array[i].length; j++) {
			sum1 += array[i][j];
		}
	}
	System.out.println("the sum of the array valuse is:" + sum1);
}
	
	
}