package com.syntax.class09;

public class NestedLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0; i<5; i++);
		System.out.println("Hello");
		 
		for (int y=5; y<3; y++) { 
		
		
		System.out.println("bye");
		
		}
		System.out.println("----------MORE EXAMPLES---------");
		
	

for (int i=10; i<14; i++) {


for (int j=1; j<=4; j++) {

	System.out.println("i =" +i+"j="+j);
}

}
System.out.println("----------how can I print clock---------");
	
	for (int h=0; h<24; h++) {
		
	for (int m=0; m<60; m++) {
		if (m<10) {
		System.out.println(h+ ":0" +m);
		}else{
			System.out.println("0"+h+ ":" +m);	
				}

		System.out.println(h +":" + m);
	}
	}}
	
	
	
	
	}


