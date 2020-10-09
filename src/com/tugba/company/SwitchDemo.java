package com.tugba.company;

public class SwitchDemo {
    public static void main(String[] args) {
        char grade = 'F';
        switch (grade) {
            case 'A':
                System.out.println("Perfect!You passed the exam successfully");
                break;
            case 'B':
                System.out.println("Good!You passed the exam successfully");
                break;
            case 'C':
                System.out.println("Not Bad!You passed the exam successfully");
                break;
            case 'D':
                System.out.println("Bad!You  didn't pass the exam ");
                break;
            default:
                System.out.println("You entered an invalid grade");
        }
    }
}
