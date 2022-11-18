package day13_methodCreation;

import java.util.Locale;

public class C03_methodCreation {
    public static void main(String[] args) {


        String isim = "berk";
        String soyisim= "karanfil";

       // isimGizleme(isim,soyisim);
        isimGizleme(isim,soyisim);

    }

    public static void isimGizleme(String isim, String soyisim) {

       String yenisim =  isim.substring(0,1).toUpperCase();
        String kalanisim = isim.substring(1).replaceAll("\\w","*");
      String yeniSoyisim = soyisim.substring(0,1).toUpperCase();
        String kalanSoyisim= soyisim.substring(1).replaceAll("\\w","*");
        System.out.println( yenisim + kalanisim + " "+ yeniSoyisim+  kalanSoyisim);


    }

}
