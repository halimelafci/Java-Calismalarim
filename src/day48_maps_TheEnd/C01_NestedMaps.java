package day48_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedMaps {

    public static void main(String[] args) {
        /*
        eger bir elemnt ile ilgili bilgiler cok fazla ise tek map ile yapmak
        imkansiz bunun icin ic ice map nested map kullanilir.
        daha düzenli olur


        örnek olarak maplerden olusan map olarak degistirelim

        sınıflistesi.put(101,"Ali, Can, Jdev");
        sınıflistesi.put(102,"Enes, Cem, Tester");
        sınıflistesi.put(103,"Derya, Deniz, Jdev");

        */

        Map<String,String> ogr1=new HashMap<>();

        ogr1.put("isim","Ali");
        ogr1.put("Soyisim","Can");
        ogr1.put("Brans","Jdev");


        Map<String,String> ogr2=new HashMap<>();

        ogr2.put("isim","Enes");
        ogr2.put("Soyisim","Cem");
        ogr2.put("Brans","Tester");

        Map<String,String> ogr3=new HashMap<>();

        ogr3.put("isim","Derya");
        ogr3.put("Soyisim","Deniz");
        ogr3.put("Brans","Jdev");

        Map<Integer,Map<String,String>>nestedOgrenci=new HashMap<>();
        nestedOgrenci.put(101,ogr1);
        nestedOgrenci.put(102,ogr2);
        nestedOgrenci.put(103,ogr3);

        Set<Map.Entry<Integer,Map<String,String>>> entryOgrenci=nestedOgrenci.entrySet();

        for (Map.Entry each:entryOgrenci ) {

            System.out.println(each);

            //101 nolu keyde isimi yazdiralim
            System.out.println(nestedOgrenci.get(101).get("isim"));
        }
    }
}
