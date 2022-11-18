package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {
        /*
         remove method'u iki sekilde kullanilir
         1- objeyi yazip silmesini istersek bize boolean sonuc doner true/false
         2- index girersek o index'deki elemani siler ve bize silinen elemani dondurur

        */
        List<String> urunler=new ArrayList<>();
        urunler.add("cikolata");
        urunler.add("seker");
        urunler.add("cips");
        urunler.add("nutella");
        System.out.println(urunler.remove("cips")); //true
        System.out.println(urunler);//[cikolata, seker, nutella] listenin yeni hali
        System.out.println(urunler.remove(0));//cikolata
        System.out.println(urunler);//[seker, nutella] listenin son hali
        //olmayan bir urunu sildirelim
        System.out.println(urunler.remove("yogurt"));//false
    }
}
