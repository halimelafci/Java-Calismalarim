package day29_passByValue_immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PasByValue {
    public static void main(String[] args) {
        /*
          bir list olusturalim
          iki ayri method'dan birinde
          sadece elemanlari degistirelim
          digerinde yeni bir list atayip,
          ayni sayida yeni eleman ekleyelim
          ve her iki method call'dan sonra kendi listemizi
          main method icerisinde kontrol edelim
         */
        List<String> isimler=new ArrayList<>();
        isimler.add("ali");
        isimler.add("veli");
        isimler.add("can");
        System.out.println("methottan önce liste :"+isimler);

        elemanlarDegistir(isimler);
        System.out.println("Main method icinde elemanlariDegis methodunda ki liste :"+isimler);

        listeyiDegistir(isimler);
        System.out.println("Main methodda listeyidegistir methodundan sonra " +isimler);
    }

    private static void listeyiDegistir(List<String> isimler) {

       isimler=new ArrayList<>(); //ayni isim veaeybl kullanılir.
        isimler.add("cay");
        isimler.add("seker");
        isimler.add("tuz");
        System.out.println("yeni listteki isimler :"+isimler);

    }

    private static void elemanlarDegistir(List<String> isimler) {
        isimler.set(0,"ayse");
        isimler.set(1,"gül");
        isimler.set(2,"nur");
        System.out.println("elemanlariDegis methodunda ki liste :"+isimler);
    }
}
