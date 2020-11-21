package com.syntax.class28;

public interface MyInterface {
 //before Java 8

public static final String name= "hi";
   void printInfo();

   //java 8
   default void printName(){
       System.out.println ("123456789" );
       // these default are used to support lambdas

   }

}
