package day13_methodCreation;

public class C02_methodCreation {
    public static void main(String[] args) {


        //4 basamakli sayinin rakamlari toplami

        int sayi=5564;

        rakamlarToplamı(sayi);


    }

    public static void rakamlarToplamı(int sayi) {

       int birlerBasamagı=0;
        int toplam=0;
       int ilkSayı=sayi;

        birlerBasamagı=sayi%10;
        toplam+=birlerBasamagı;
        sayi/=10;


        birlerBasamagı=sayi%10;
        toplam+=birlerBasamagı;
        sayi/=10;

        birlerBasamagı=sayi%10;
        toplam+=birlerBasamagı;
        sayi/=10;

        birlerBasamagı=sayi%10;
        toplam+=birlerBasamagı;
        sayi/=10;
        System.out.println( "verilen "+ ilkSayı+ " sayısının rakamlar toplamı="+toplam);


    }
}
