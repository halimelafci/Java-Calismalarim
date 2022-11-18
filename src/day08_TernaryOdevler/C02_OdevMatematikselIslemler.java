package day08_TernaryOdevler;

import java.util.Scanner;

public class C02_OdevMatematikselIslemler {
    public static void main(String[] args) {



        // soru 1 kullanicidan sayi alin ciftmi tekmi yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println( "bir sayı girin");
        int sayi=scan.nextInt();

        System.out.println(sayi%2 ==0  ? "cift" : "tek");






        // soru 2 kullanicidan bir tamsayi alin 10dan kücükse rakam
        //100den kücükse iki basamakli sayi
        //degilse 3 basamakli sayi veya daha büyük sayi

        Scanner sccann= new Scanner(System.in);
        System.out.println( "bir tamsayı girin");

        int sayi2=scan.nextInt();
        System.out.println(sayi2<10 ? "rakam": sayi2<100 ? "iki basamaklı" : "3 basamakli sayi veya daha büyük sayi");






    }
}
