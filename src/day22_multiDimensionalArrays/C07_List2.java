package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_List2 {
    public static void main(String[] args) {
     //list pirimitiv data turlerini kabul etmez. Wraper class olmali.
        List<Integer> sayilar=new ArrayList<>();
        //Listin kotu yani sayilari tek tek eklemek lazim
        sayilar.add(5);
        sayilar.add(6);
        System.out.println(sayilar);//[5,6]
        // sadece add() kullanirsak Java sona ekler

    }
}
