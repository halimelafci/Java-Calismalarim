package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_İndexOf {
    public static void main(String[] args) {

        List<String> urunler=new ArrayList<>();
        urunler.add("cikolata");
        urunler.add("seker");
        urunler.add("cips");
        urunler.add("nutella");
        System.out.println(urunler);//[cikolata, seker, cips, nutella]
        System.out.println(urunler.indexOf("seker")); //1
       /*
         indexOf method'u bize bilgi donduren bir method'dur
         listemizi degistirmez
         */
        urunler.add("kraker");
        System.out.println(urunler);//[cikolata, seker, cips, nutella, kraker]
        urunler.add("cikolata");//[cikolata, seker, cips, nutella, kraker, cikolata] sona cikolata ekledi
        System.out.println(urunler);
        System.out.println(urunler.lastIndexOf("cikolata")); // 5 inci indexte buldu cunku
        // lastİndex aramaya sondan indexi saymaya bastan baslar

        System.out.println(urunler.lastIndexOf("cay"));//-1 olmayan urun icin -1 doner




    }
}
