package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScaner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan;
String[] names;
int size;

scan=new Scanner(System.in);
System.out.println("How many names would you like to store");
size=scan.nextInt();
names=new String[size];

for (int i=0; i<size; i++) {
	System.out.println("Please enter any name");
	names[i]=scan.next();
}
for (int i=0; i<names.length; i++) {
	System.out.println(names[i]+ " ");
	
}
		}
	}


