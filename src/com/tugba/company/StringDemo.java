package com.tugba.company;

public class StringDemo {

    public static void main(String[] args) {
        String mesaj = "  Bugun hava cok guzel.";
        System.out.println(mesaj);

        /*
        System.out.println("Eleman sayisi =" + mesaj.length());
        System.out.println("5.Eleman :" + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yasasın!"));
        System.out.println(mesaj.startsWith("B"));//TRUE B İLE Mİ BAŞLIYOR?
        System.out.println(mesaj.startsWith("A"));//FALSE
        System.out.println(mesaj.endsWith("."));//TRUE

        char[] karakterler = new char[5] ;
        mesaj.getChars(0,5,karakterler,0);//5 dahil değil
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));//aramaya soldan baslar
        System.out.println(mesaj.lastIndexOf('e'));//aramaya sagdan baslar
    */
        // System.out.println(mesaj.replace(' ' ,'-'));
        String yeniMesaj=mesaj.replace(' ' ,'-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2)); //2 den itibaren
        System.out.println(mesaj.substring(2,7));//7 dahil değil 2 den 7 ye kadar

        for (String kelime : mesaj.split(" "))
        {
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());

    }
}
