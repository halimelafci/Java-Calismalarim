package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {
         /*
          elimizde urunlerin bulundugu bir liste var
          urun listesindeki istenen siradaki urunu
          istegimiz yeni urunle degistirip
           eski urunu, varolan eski urunler listesine ekleyelim
         */
        List<String> urunler=new ArrayList<>();
        urunler.add("cikolata");
        urunler.add("seker");
        urunler.add("cips");
        urunler.add("nutella");
        List<String> eskiUrunler=new ArrayList<>();

        String yeniUrun="tuz";
        String degisecekUrun="seker";


    }
}
