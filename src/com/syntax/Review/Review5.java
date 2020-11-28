package com.syntax.Review;

public class Review5 {
    public static void main(String[] args) {
        String str="Danilo";
        String str2=new String("anything ! @@345&*");
        System.out.println (str2 );

        System.out.println (str.length () );
        System.out.println (str2.length () );
       String name="Mina 123!@#";
        System.out.println (name.toUpperCase () );
        System.out.println (name.toLowerCase () );
        String newString=str.concat ( name );
        System.out.println (newString );
        System.out.println (str+name );

        String var1=null;
        String var2="Burju";
        System.out.println (var1+var2 );
        System.out.println (var2+var1 );

    }
}
