package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_remove {
    public static void main(String[] args) {
        /*
         Sayilardan olusan bir list varsa
         java remove method'unda sayi yazdigimizda direk index olarak kabul eder
         */
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(2);
        sayilar.add(0);
        sayilar.add(6);
        sayilar.add(1);
        System.out.println(sayilar.remove(2));// ikinci index de 6 rakami oldugundan onu sildi
        System.out.println(sayilar);//[2, 0, 1]

      // illa da 2 rakamını silmek istersek;

        System.out.println(sayilar.remove(sayilar.indexOf(2)));// 2 yi sildi
        System.out.println(sayilar); //[0, 1]


    }
}
