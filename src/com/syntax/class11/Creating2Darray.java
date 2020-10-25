package com.syntax.class11;

public class Creating2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// create a 2d array of food:
	//american
		//italian
		//asian
		//afghani
		//indian
		
	String[] [] food= {
			{"Steak","hotdogs","cheeseburger"},
			{"pizza","pasta","canoli"},
			{"sushi","ramon","fried rice","dumplings"},
			{"kebab","manto"},
			{"beriyani","masal","curry","Chiken tikka masala"}
	};
	for(String[] dishes:food) {
		for(String dish:dishes) {
		System.out.println(dish+ "");	
		}
		System.out.println("");	
	
	}
		
	System.out.println("------------------------------------------");		
		
	for (int i=0; i<food.length; i++)	{
		for (int j=0; j<food[i].length; j++) {
		System.out.println(food[i] [j] +"");
		
		}
		System.out.println("");	
	}
		
	}

}
