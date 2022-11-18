package day08_TernaryOdevler;

import java.util.Scanner;

public class C01_KucukSayiYazdirma {
    public static void main(String[] args) {
        //kullanıcıdan iki sayı isteyin kucuk olanı yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen birinci sayıyı girin");
        double sayi1=scan.nextDouble();
        System.out.println("lutfen ikinci sayıyı girin");
        double sayi2=scan.nextDouble();
        System.out.println(sayi1<sayi2 ? sayi1 : sayi2 );

    }
}
