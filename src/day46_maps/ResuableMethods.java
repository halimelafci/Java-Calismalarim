package day46_maps;

import java.util.*;

public class ResuableMethods {

    public static Map<Integer, String> mapOlustur(){
        Map<Integer,String>sınıflistesi=new HashMap<>();
        sınıflistesi.put(101,"Ali, Can, Jdev");
        sınıflistesi.put(102,"Enes, Cem, Tester");
        sınıflistesi.put(103,"Derya, Deniz, Jdev");
        sınıflistesi.put(104,"Taha, Emre, Tester");
        sınıflistesi.put(105,"Taha, Emre, Jdev");
        sınıflistesi.put(106,"Taha, Emre, Tester");

        return sınıflistesi;
    }


    public static void valuleriYzdir(Map<Integer, String> ogrenciMap) {
        int sira=1;
        for (String each:ogrenciMap.values() ) {

        System.out.println(sira+" "+each);

            sira++;

        }
    }


    public static List<String> isimSoyisim(Map<Integer, String> ogrenciMap) {
        String arr[];
        List<String>liste=new ArrayList<>();
        for (String each:ogrenciMap.values() ) {

            arr=each.split(", ");
           liste.add(arr[0]+" "+arr[1]);


        }
        return liste;
    }

    public static void bransOgrenciSayisiYazdir(Map<Integer, String> sinifListesiMap) {

        Map<String, Integer> bolumdekiOgrenciSayisi = new TreeMap<>();

        Collection<String> siniflistesiCollection = sinifListesiMap.values();
        String[] arr;
        String brans = "";
        int bransSayisi;
        for (String each : siniflistesiCollection) {

            arr = each.split(", ");
            brans = arr[2];


        if (!bolumdekiOgrenciSayisi.containsKey(brans)) {
            bolumdekiOgrenciSayisi.put(brans, 1);


        }else {
          bransSayisi= bolumdekiOgrenciSayisi.get(brans);
          bolumdekiOgrenciSayisi.put(brans,++bransSayisi);

        }


    }
        System.out.println(bolumdekiOgrenciSayisi);
    }


    public static void entryOlustur(Map<Integer, String> siniflistesi) {

        Set<Map.Entry<Integer,String>>sinifListesiEnry=siniflistesi.entrySet();
        for (Map.Entry each:sinifListesiEnry ) {

            System.out.println(each);


        }
    }
}
