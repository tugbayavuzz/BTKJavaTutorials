package com.tugba.company;

public class Methods2 {
    public static void main(String[] args) {
        String mesaj="Bugün hava cok güzel.";
        System.out.println(mesaj.substring(2,5));
        String yeniMesaj=sehirVer();
        System.out.println(yeniMesaj);
        int toplam1 = topla(5,7);
        System.out.println(toplam1);

        int toplam=topla2(1,2,5,4,8);
        System.out.println(toplam);
    }

    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Guncellendi");
    }
    public static int topla(int x,int y){
       return x+y;
    }
    public static int topla2(int...  sayilar){
        int toplam=0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
    public static String sehirVer(){
        return "Ankara";
    }
}
