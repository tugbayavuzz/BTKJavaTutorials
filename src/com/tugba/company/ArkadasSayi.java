package com.tugba.company;

public class ArkadasSayi {
    public static void main(String[] args) {
        int number = 220;
        int number2 = 284;
        int toplam = 0, toplam2 = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                toplam += i;
            }
        }
        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                toplam2 += i;
            }
        }
        if (number == toplam2 && number2 == toplam) {
            System.out.println("arkadas sayidir");
        } else
            System.out.println("arkadas sayi değildir");
    }

}
