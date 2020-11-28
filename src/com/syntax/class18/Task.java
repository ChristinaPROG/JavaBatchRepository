package com.syntax.class18;
public class Task {
    public static void main(String[] args) {
        //1, declare and initialize at the same time
        int[] intArr = {3, 5, 7, 1, 15};
        //2. Declare first and then assign values
        int[][] intArr1 =new int [2][3];

        intArr1[0][0] = 23;
        intArr1[0][1] = 12;
        intArr1[0][2] = 23;

        intArr1[1][0] = 5;
        intArr1[1][2] = 6;
        intArr1[1][2] = 3;
        // lets find the sum of all values in our array
        int sum = 0;

        for (int i = 0; i < intArr1.length; i++) {
            for (int j = 0; j < intArr1[i].length; j++) {
//   sum=sum+intArr1 [i][j];
                sum += intArr1[i][j];
                System.out.println ( sum );

            }
        }


    }

}