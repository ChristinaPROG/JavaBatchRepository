package HomeWork;

import java.util.Scanner;

public class HomeWork81Array {

	public static void main(String[] args) {
	    int[] myArray = new int[5];
	    Scanner input = new Scanner(System.in);
	    for(int i=0;i<5;i++){
	        myArray[i] = input.nextInt();
	    }
	    for (int j = 0; j < myArray.length; j++) {
	        System.out.println(myArray[j]);
	    }
	    for (int j = myArray.length - 1; j >= 0; j--) {
	        System.out.println(myArray[j]);
	    }
	}
}

