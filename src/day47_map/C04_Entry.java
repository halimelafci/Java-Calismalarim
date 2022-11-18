package day47_map;

import day46_maps.ResuableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {
        Map<Integer,String>sinifListMap= ResuableMethods.mapOlustur();

        System.out.println(sinifListMap);

        Set<Map.Entry<Integer,String>>siniflistEntry=sinifListMap.entrySet();

        for (Map.Entry<Integer,String> each:siniflistEntry ) {

            System.out.println(each);

            System.out.println(each.getValue());

        }
        /*
        java da her bir entry key=value den olusur.
        bir entrye ulastigimizda hem key hem value getirir ve istedigimiz islemi yapariz

        entry.getKey() bize keyi getirir
        entry.getValue() bize value i getirir
        entry.setValue() valueyiistedigimiz deger olarak update yapariz
         */

        //map icerisindeki Jdev kelimelerini C++  ile degistrin

        String value="";
        for (Map.Entry<Integer,String> each2:siniflistEntry) {

            value=each2.getValue();

            value=value.replaceAll("Jdev","C++");
            each2.setValue(value);


        }
        System.out.println(sinifListMap);


    }
}
