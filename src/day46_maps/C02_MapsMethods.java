package day46_maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethods {

    public static void main(String[] args) {

    Map  <Integer,String> ogrenciMap=ResuableMethods.mapOlustur();

        System.out.println(ogrenciMap);

        //{101=Ali, Can, Jdev, 102=Enes, Cem, Tester, 103=Derya, Deniz, Jdev, 104=Taha, Emre, Jdev}

        //valuleri

        ResuableMethods.valuleriYzdir(ogrenciMap);

           //isim ve soyisimlri birlikte yazdir  liste olusturun

       List<String> isimSoyisimListesi= ResuableMethods.isimSoyisim(ogrenciMap);

        System.out.println(isimSoyisimListesi);

        //kac farkli brans varsa bransİsmi=branstakiOgrenciSayisi seklinde yazdirin

      // Map<String,Integer>brnİsmiOgrenciSayisi= ResuableMethods.bransİsmiBransdakiOgrenciSayisi(ogrenciMap);

    }


}
