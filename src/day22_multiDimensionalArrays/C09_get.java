package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C09_get {
    public static void main(String[] args) {
     List<Integer> sayilar =new ArrayList<>();
     sayilar.add(7);
     sayilar.add(4);
     sayilar.add(8);
     List<String> isimler=new ArrayList<>();
     isimler.add("halime");
     isimler.add("burak");
     isimler.add("lafcılar");
        System.out.println(isimler.get(1));//burak
        System.out.println(sayilar.get(2));//8
        //get index donderir.
    }
}
