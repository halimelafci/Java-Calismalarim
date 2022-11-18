package day26_constructor;

public class ArabaRannur {
    public static void main(String[] args) {

    Araba araba1=new Araba();
        System.out.println(araba1.fiyat);//bir onceki clasda fiyat deger ne
        // onu alır. ama biz burda deger atamasi yapsaydik onu alirdi.
        Araba araba2=new Araba();
        araba2.marka="bmv";
        araba2.fiyat=1234;
        araba2.yil=2010;
        System.out.println("araba iki bilgiler \nMarka : "+araba2.marka+"\nfiyat : "+araba2.fiyat+"\nYil : "+araba2.yil);
        // model atamasini yapmadigim icin model cikmadi sout yapinca.
        System.out.println();
        Araba araba3=new Araba("BMV","c200",2020,1234);
        System.out.println("araba 3 bilgiler \nMarka : "+araba3.marka+"\nfiyat : "+araba3.fiyat+"\nYil : "+araba3
                .yil+ "\nmodel : "+araba3.model);
        //parametreli obje olusturdugunda diger class da olusturdugun objeye (parametre sayısına uygun) uygun consturoctur olmalı
    }
}
