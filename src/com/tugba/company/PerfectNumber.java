package com.tugba.company;

public class PerfectNumber {
    public static void main(String[] args) {
        int number = 2;
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                total += i;
        }
        if (number == total) {
            System.out.println("Perfect number");
        } else
            System.out.println("Perfect number isn't");
    }
}
