package com.syntax.class23;
class Bank{
    double bankBalance;
    public Bank(double bankBalance){
       this.bankBalance= bankBalance;
    }
    void printTransferFee(){
        System.out.println ("TransferFee" +bankBalance*0.1 );
    }
    class BOA extends Bank{

        public BOA(double bankBalance) {
            super ( bankBalance );
        }
    }
    class Chase extends Bank{

        public Chase(double bankBalance) {
            super ( bankBalance );
        }
        void printTransferFee(){
            System.out.println ("TransferFees" + bankBalance *0.01 );
        }
    }

}











public class OverridingExample {
    public static void main(String[] args) {

    }
}
