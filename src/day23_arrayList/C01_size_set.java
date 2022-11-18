package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_size_set {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(4);
        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(9);
        System.out.println(sayilar.size());//4 uzunluk verir. list de lengt olmaz size() methodunu kullaniriz.
        sayilar.addAll(sayilar);
        System.out.println(sayilar);//[4, 3, 2, 9, 4, 3, 2, 9] addAll dedigimiz icin tekrar yazdi
        System.out.println(sayilar.size());//8

        sayilar.set(0,2);//[2, 3, 2, 9, 4, 3, 2, 9] kalici olarak degisti.
        System.out.println(sayilar);//[2, 3, 2, 9, 4, 3, 2, 9]

    }
}
