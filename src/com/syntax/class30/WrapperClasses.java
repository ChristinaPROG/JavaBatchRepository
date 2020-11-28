package com.syntax.class30;

import com.syntax.Udemy1.Char;

import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
        // we have 8 primitive types and for each primitive type we have a wrapper class
        byte byteNumbers=127; // can store max-128 to 127
        short shortNumbers= 1000; // can store numbers from 32768 up to 32767
        int number=101512; // can store up to 2 billion
        long longNumbers= 13245312153453131l;
        float floatNumbers=1520.2125f;
        double numberWithDecimalsPoints=10.5;
        char characters='A';
        boolean flags=true;

        String stringNumber="10";
        //System.out.println (stringNumber*2 );
        int convertedNumber=Integer.parseInt ( stringNumber );
        System.out.println (convertedNumber*2 );

        Byte nonPrimitivebyteNumbers=127; // can store max-128 to 127
        Short nonPrimitiveshortNumbers= 1000; // can store numbers from 32768 up to 32767
        Integer nonPrimitivenumber=101512; // can store up to 2 billion
        Long nonPrimitiveLongNumbers= 13245312153453131l;
        Float nonPrimitivefloatNumbers=1520.2125f;
        Double nonPrimitivenumberWithDecimalsPoints=10.5;
       Character nonPrimitivecharacters='A';
        Boolean nonPrimitiveflags=true;

        int primitiveInt=10;
        Integer nonPrimitiveInteger=primitiveInt;
        primitiveInt=nonPrimitiveInteger;
        System.out.println (nonPrimitivebyteNumbers.doubleValue () );

        ArrayList<Integer>integerArrayList= new ArrayList<> (  );
    }
}
