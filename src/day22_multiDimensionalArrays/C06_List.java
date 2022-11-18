package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        /*
          array'i array yapan sembol [] idi
          arrayList de ise <> diamond(elmas) kullaniriz
         */
        List<String> isimler= new ArrayList<>(); //ikinci diamond da String yazmaya gerek yok
        System.out.println(isimler); // burda isimler bos oldugu icin sadece [] bu isareti goruruz
        isimler.add("halime");
        System.out.println(isimler); // isimlere halime ismini ekledik
        System.out.println(isimler.add("burak"));// burda ise true doner add boolean doner.
        System.out.println(isimler);//[halime, burak] yeni degeri

    }
}
