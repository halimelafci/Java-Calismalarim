package day19_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_lengt {
    public static void main(String[] args) {


        int sayilar[]={1,2,3,4};
        String harfler[]=new String[3];

        // iki sekilde array olusturabiliriz
        System.out.println(sayilar.length);//4
        System.out.println(harfler.length);//3 Array de length() methodunun () parantezi olmaz.
        System.out.println(Arrays.toString(harfler));//[null, null, null]atama yapilmadigi icin null olarak yazdiri
        System.out.println(Arrays.toString(sayilar));//[1, 2, 3, 4] ilk etapta belirlendigi icin sayilari yazdirdi

    }
}
