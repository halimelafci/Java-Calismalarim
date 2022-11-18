package day48_maps_TheEnd;

import day46_maps.ResuableMethods;

import java.util.Map;

public class C02_MapMethodlari {
    public static void main(String[] args) {
        Map<Integer,String>siniflistesi= ResuableMethods.mapOlustur();

        ResuableMethods.entryOlustur(siniflistesi);

        siniflistesi.clear();
        System.out.println("clear methodundan sonra siniflistesi :"+siniflistesi); //bos bir liste oldu

        siniflistesi.putIfAbsent(101,"halime, lafci, tester");//eger listede yoksa ekle
        System.out.println(siniflistesi);
        siniflistesi.putIfAbsent(102,"burak, lafci, QA ");
        System.out.println(siniflistesi);
        

    }
}
