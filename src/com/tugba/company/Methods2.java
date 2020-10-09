package com.tugba.company;

public class Methods2 {
    public static void main(String[] args) {
        String mesaj="Bugün hava cok güzel.";
        String yeniMesaj=sehirVer();
        System.out.println(yeniMesaj);
        int toplam = topla();
        System.out.println(toplam);
    }

    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Eklendi");
    }
    public static void guncelle(){
        System.out.println("Eklendi");
    }
    public static int topla(){
       return 5+5;
    }
    public static String sehirVer(){
        return "Istanbul";
    }
}
