package com.tugba.company;

public class Methods {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 4, 5, 8, 9};
        int aranacakSayi = 6;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacakSayi) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            System.out.println(aranacakSayi+ "Sayisi mevcut");
        } else
            System.out.println(aranacakSayi+" Sayisi mevcut değil");

    }
}
