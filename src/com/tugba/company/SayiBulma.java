package com.tugba.company;

public class SayiBulma {
    public static void main(String[] args) {
        int[] sayilar= new int[]{1,2,4,5,8,9};
        int aranacakSayi=6;
        boolean varMi=false;

        for (int sayi: sayilar){
            if (sayi==aranacakSayi){
                varMi=true;
                break;
            }
        }
        if (varMi){
            System.out.println("Sayi mevcut");
        }
        else
            System.out.println("Sayi mevcut değil");
    }
}
