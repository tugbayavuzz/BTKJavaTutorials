package com.tugba.company;

public class SesliHarf {
    public static void main(String[] args) {
        char harf='i';
        if (harf=='A' || harf=='I' || harf=='O' || harf=='U' ){

            System.out.println("Kalın sesli bir harftir");
        }
        if (harf=='E' || harf=='İ' || harf=='Ö' || harf=='Ü'){
            System.out.println("İnce sesli bir harftir");
        }
    }
}
