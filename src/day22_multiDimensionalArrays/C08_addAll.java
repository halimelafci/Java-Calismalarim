package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C08_addAll {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(4);
        sayilar.add(3);
        List<Integer> sayilar1=new ArrayList<>();
        sayilar1.add(7);
        sayilar1.add(9);
        sayilar1.add(1);
        sayilar.addAll(sayilar1);// kalici olarak sayılar degismis oldu
        System.out.println(sayilar); //[5, 4, 3, 7, 9, 1] addAll methodu ile ikisini birlrstirdik
        //System.out.println(sayilar.add(4)); yaparsak 4 rakamini en sona ekler
        sayilar.addAll(2,sayilar1);
        System.out.println(sayilar);//[5, 4, 7, 9, 1, 3, 7, 9, 1] index 2 den sonra sayilar1 eklendi.
    }
}
