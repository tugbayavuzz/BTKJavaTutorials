package com.tugba.company;

public class RecapDemo2 {
    public static void main(String[] args) {
        double[] myList = {1.2,1.3,6.4,1.5};
        double total=0;
        double max=myList[0];

        //double[] myList = new double[4];
        //ekrana yazdıralım for döngüsü ile
        for(double number: myList)
        {

            if(max<number){
                max=number;
            }
            total+=number;
            System.out.println(number);

        }
        System.out.println("Total = "+total);
        System.out.println("MaxNumber = "+max);
    }
}
