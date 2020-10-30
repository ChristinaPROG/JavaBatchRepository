package com.syntax.class13;

public class SmartPhone {
    String brand;
    String size;
    String color;
    String model;
    String photos;

    void dial() {
        System.out.println (brand+ "can dial" );
    }
    void call(String phoneNumber) {
        System.out.println ( "Calls"+ phoneNumber );
    }
    void text() {
        System.out.println (brand +"can text" );
    }
    void pics(){
        System.out.println (brand+"can take a picture");
    }
    


}

