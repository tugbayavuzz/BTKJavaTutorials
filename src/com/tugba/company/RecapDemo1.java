package com.tugba.company;

public class RecapDemo1 {
    public static void main(String[] args) {
        int number1=10;
        int number2=20;
        int number3=30;
        int greatest = number1;

        if(greatest<number2)
            greatest=number2;

        if (greatest<number3)
            greatest=number3;

            System.out.println("The greatest  number is "+greatest);


    }
}
