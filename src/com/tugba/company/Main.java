package com.tugba.company;

public class Main {

    public static void main(String[] args) {
        //classlar referans tiptir. Reference type
        CustomerManager customerManager = new CustomerManager();//CustomerManager Çağırma işlemi
        CustomerManager customerManager1 =new CustomerManager();
        customerManager=customerManager1;
        //CustomerManager customerManager stackte  tutuluyor
        //new CustomerManager(); heapte tutuluyor

        customerManager.Add();
        customerManager.Delete();
        customerManager.Update();

        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.Topla(3,4);
        int sonuc1=dortIslem.Cikar(3,4);
        int sonuc2=dortIslem.Carp(3,4);
        int sonuc3=dortIslem.Bol(3,4);

        System.out.println("Toplam= "+sonuc+" Cikarma= "+sonuc1+" Carpma= "+sonuc2+" Bolme= "+sonuc3);


    }
}
