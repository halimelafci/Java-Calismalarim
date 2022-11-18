package day12_stringManipulation;

import java.util.Scanner;

public class C10_OdevDort {
    public static void main(String[] args) {


        //kullanicidan isim ve soyisim isteyin ve hangisinin daha uzun oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isiminizi girin");
        String isim=scan.nextLine();
        System.out.println("lütfen soyisiminizi girin");
        String soyisim=scan.nextLine();
        int isimUzunluk=isim.length();
        int soyisimUzunluk=soyisim.length();
        System.out.println(isimUzunluk < soyisimUzunluk ? "soyisim isimden uzun" : "isim soyisimden uzun");



    }
}
