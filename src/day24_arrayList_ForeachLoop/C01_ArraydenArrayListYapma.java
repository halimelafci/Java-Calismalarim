package day24_arrayList_ForeachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapma {
    public static void main(String[] args) { /*
        Uzun listeler olusturmamiz gerektiginde,
        tek tek eklemek yerine array olusturup, bunlari list'e cevirmek
        daha pratik olabilir
        1- loop ile array'deki tum elementleri list'e atabiliriz
        2- Arrays.asList() kullanabiliriz
           Ancak bu method'un 2 tane kotu yan etkisi var
           - Arrays class'i kullanildigi icin array ozellikleri gecerli olur
             dolayisiyla list'te olan add, remove gibi size'i degistiren method'lar
             bu sekilde olusturulan list'lerde kullanilamaz
           - kaynak olan array ile urun olan list ozdeslestirilir
             birinde yapilan degisiklik, otomatik olarak digerine de islenir
         */
        String[] arr={"ali" , "ayse" , "mehmet" };
        List<String> yeniListe= Arrays.asList(arr);
        System.out.println(yeniListe);//[ali, ayse, mehmet]
        arr[0]="veli";
        System.out.println(yeniListe);//[veli, ayse, mehmet]yapilan degisiklik arr de ama list de ayni degisiklik oldu




    }
}
