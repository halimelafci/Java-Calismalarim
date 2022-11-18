package day45_collections;

import java.util.ArrayList;
import java.util.List;

public class C02_CollectionsDataTuru {

    public static void main(String[] args) {

        List liste=new ArrayList<>();

        liste.add(5);
        liste.add(true);
        liste.add('a');
        liste.add("halime");
        System.out.println(liste);//[5, true, a, halime]
        //burda hepsini kabul etmesinin sebebi data turu olarak object olarak akbul eder.

        List<Object> liste1=new ArrayList<>();

        liste1.add(9);
        liste1.add(true);
        liste1.add('b');
        liste1.add("halime");
        System.out.println(liste1);//[9, true, b, halime]
        /*
        java da object data turunde bu mümkün olsa bile islem yapacagimiz zaman
        anlamayabilir yada yanlis sonuc cıkabilir bunun iicn casting yapmak gerekir
        */

        liste1.set(0,(Integer)liste1.get(0)+3);
        liste1.set(2,"ali");
        System.out.println(liste1); //[12, true, ali, halime]
    }
}
