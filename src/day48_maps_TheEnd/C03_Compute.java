package day48_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;

public class C03_Compute {
    public static void main(String[] args) {
        Map<String,Integer>harfMapi=new HashMap<>();

        harfMapi.put("A",5);
        harfMapi.put("B",3);
        harfMapi.put("C",2);
        harfMapi.put("D",4);
        harfMapi.put("E",9);

        System.out.println(harfMapi);

       harfMapi.compute("A",(k,v)->(v+1));
        System.out.println(harfMapi);
        harfMapi.compute("C",(k,v)->(v*v));
        System.out.println(harfMapi);
        harfMapi.computeIfAbsent("D",(v)->5);// D yoksa 5 degerini ekle demek ama oldugu icin eklemeyecek
        System.out.println(harfMapi);
        harfMapi.computeIfAbsent("F",(v)->(7));//F dgerine 7 atama yapıldı
        System.out.println(harfMapi);

    }
}
