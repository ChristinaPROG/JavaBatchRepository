package com.syntax.class11;

import java.util.Arrays;

public class GroupTask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray= {66,45,65,965,32,876,900};
		int max=myArray[0];
		int size=myArray.length;
		int secondmax=myArray[size-1];
		for(int i=0;i<myArray.length;i++) {
			if(myArray[i]>max) {
				secondmax=max;
				max=myArray[i];
			}
			else if(myArray[i]>secondmax){
				secondmax=myArray[i];
				
				}
			
			}
		
		System.out.println("the largest number in array is :"+max);
		System.out.println("the 2nd largest number is :"+secondmax);
	
		
		System.out.println("------------------------------------------------------------------");	
		
	double[] num1= {1,5,3,6};
	int length=num1.length;
	Arrays.sort(num1);
	System.out.println("Second highest number is "+num1[length-2]);
		
	System.out.println("------------------------------------------------------------------");	
	
	
	
	
	
	 int[] array = { 2, 5, 7, 89, 452 };
     int max1 = array[0];
     for (int d = 1; d < array.length; d++) {
         if (array[d] > max1) {
             max1 = array[d];
         }
     }
     int max2 = array[0];
     for (int q = 0; q < array.length; q++) {
         if (array[q] == max1) {
             continue;
         } else if (array[q] > max2) {
             max2 = array[q];
         }
     }
     System.out.println("second largest number is " + max2);
     
     
     System.out.println("------------------------------------------------------------------");	
     
     int[] array1 = {1067, 90, 450, -34, 450, 1, 199};
		int max11 = array1[0];
		int secondMax = 0;
		for (int i = 1; i < array1.length; i++) {
			if (array1[i] > max11) {
				secondMax = max11;
				max11 = array1[i];
			} else if (array1[i] > secondMax && array1[i] != max11) {
				
				secondMax = array1[i];
			}
		}
		System.out.println(secondMax);


     
     
}
}
