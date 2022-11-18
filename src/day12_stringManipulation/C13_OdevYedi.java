package day12_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C13_OdevYedi {
    public static void main(String[] args) {


        //kullanicidan ismini,soyismini ve kredi kart numarasini isteyin
        //isim-soyisim:H***** L****
        //kart no :1243 **** **** ****

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isminizi girin");
        String isim=scan.nextLine().toUpperCase();
        System.out.println("lütfen soyisiminizi giriniz");
        String soyisim=scan.nextLine().toUpperCase();
        System.out.println("lütfen kredi kart numaranızı girin");
      String kredi=scan.nextLine();
        String yeniİsim=isim.substring(0,1);
        String isimKalan=isim.substring(1).replaceAll("\\w","*");
        String yeniSoyİsim= soyisim.substring(0,1);
        String soyisimKalan=soyisim.substring(1).replaceAll("\\w","*");
        String yeniKrediKart=kredi.substring(0,4);
        String kartKalan= " **** **** ****";
        System.out.println(yeniİsim + isimKalan+" " + yeniSoyİsim + soyisimKalan +"\n"+yeniKrediKart +kartKalan);


    }
}
