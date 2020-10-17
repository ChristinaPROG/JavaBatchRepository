package com.syntax.class04;

public class NestedIfConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Asghar";
String pass="pass123";
double accountBalance=10.25;
double transferAmount=8;
boolean transAllowed=true;
if(pass.equals("pass123")) {	
	System.out.println("Welcome to syntax bank "+ name);
	if(transAllowed) {
	if(transferAmount>accountBalance) {
		
System.out.print("insufficient balance");

	}else {

System.out.print("you are not allowed to transfer");
}		
}else {		
	

System.out.print("invalid credtials please try again");		
		
	}

}}}
