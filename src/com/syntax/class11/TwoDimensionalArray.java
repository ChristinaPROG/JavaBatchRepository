package com.syntax.class11;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char[] []  $array=new char [3] [4];

//add value to the first row
$array[0] [0]='A';
$array[0] [1]='B';
$array[0] [2]='C';
$array[0] [3]='D';

$array[1] [0]='W';
$array[1] [1]='X';
$array[1] [2]='Y';
$array[1] [3]='Z';

System.out.println($array[1][3]);

System.out.println("------------------Another wy to create a 2D Array--------------");

int [] [] array= {
		
		{10,20,30},
		{1,2,3},
		{100,200,300},
};
System.out.println(array[2][1]);
System.out.println(array[0][0]);
System.out.println("The size of array of integers = "+array.length);

}

	
	
}
