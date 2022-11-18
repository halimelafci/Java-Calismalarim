package day46_maps;

import java.util.*;

public class C01_Maps {

    public static void main(String[] args) {
        Map<Integer,String>sınıflistesi=new HashMap<>();

        sınıflistesi.put(101,"Ali, Can, Jdev");
        sınıflistesi.put(102,"Enes, Cem, Tester");
        sınıflistesi.put(103,"Derya, Deniz, Jdev");
        sınıflistesi.put(104,"Taha, Emre, Jdev");
        sınıflistesi.put(105,"ahmet, Can, Jdev");
        sınıflistesi.put(106,"gül, Cem, Tester");
        sınıflistesi.put(107,"Derya, han, Jdev");
        sınıflistesi.put(108,"veli, Emre, Jdev");

        System.out.println(sınıflistesi);
        //{101=Ali, Can, Jdev, 102=Enes, Cem, Tester, 103=Derya, Deniz, Jdev, 104=Taha, Emre, Jdev}

        /*
        birden fazla data türü kullanilir
        key ve value kullanilir key tek unic olmali (tc no)gibi
        value degerler ise string olur bircok deger icinde olur
         */

        System.out.println(sınıflistesi.keySet());//[101, 102, 103, 104]
        System.out.println(sınıflistesi.values());//[Ali, Can, Jdev, Enes, Cem, Tester, Derya, Deniz, Jdev, Taha, Emre, Jdev]

        System.out.println(sınıflistesi.size());//listenin icinde kac key,value oldugunu getirir //4

        //tüm ögrencilerin isim ve soyisimlerini alt alta yazin;


        Collection<String>sinifliste=sınıflistesi.values();
         String arr[]=new String[sınıflistesi.size()];

         int sira=1;

        for (String each:sinifliste) {
            arr=each.split(", ");

            System.out.println( sira+"-"+arr[0]+" "+arr[1]);
            sira++;
        }

      //isim ve soyisimlerin oldugu liste olusturalim

        List<String>isimSoyisimListesi=new ArrayList<>();
        for (String each:sinifliste ) {
            arr=each.split(", ");
            isimSoyisimListesi.add(arr[0]+" "+arr[1]);


        }
        System.out.println(isimSoyisimListesi);

    }

}
