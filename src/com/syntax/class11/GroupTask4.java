package com.syntax.class11;

public class GroupTask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArray[] = { 8, 11, 12, 13, 2, 25, 65, 34, 54, 99, 76, 87, 10, 54 }; // 14 elements
	
		int min = myArray[0];
		int max = myArray[0];
		
		for (int i = 1; i <myArray.length; i++) {
			if (myArray[i]> max) {
				max = myArray[i];
			}
				if (min> myArray[i]) {
				min = myArray[i];
		
		System.out.println("The smallest value in the Array is: " + min);
		System.out.println("The smallest value in the Array is: " + max);
	}

}

}
}