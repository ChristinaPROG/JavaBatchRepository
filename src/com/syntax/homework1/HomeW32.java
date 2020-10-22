package com.syntax.homework1;

import java.util.Scanner;

public class HomeW32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan=new Scanner(System.in);
	    System.out.println("Please enter your gender: M or F");
	    String gender=scan.nextLine();
	  
	    System.out.println("Please enter your age"); 
	    int age=scan.nextInt();
	    if(age>25){
	    
	    if(gender.equals("F")) { 
	    	   System.out.println("Woman");
	      }else{
	        System.out.println("Man");
	      
	    if (age<25)
	      if(gender.equals("M")) {
	        System.out.println("Girl");
	      }else{
	        System.out.println("Boy");
	        
	        
	      }
	    }
	
	}

	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	

}
