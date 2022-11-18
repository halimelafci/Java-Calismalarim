package day24_arrayList_ForeachLoop;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArraydenListOlusturma {
    public static void main(String[] args) {

        int[] arr={1,2,4,7,0,4,2,5};
        List<Integer> sayiListesi=new ArrayList<>();
        
        for (int i = 0; i<arr.length; i++) {
            sayiListesi.add(arr[i]);

        }
        System.out.println("sayiListesi = " + sayiListesi);

    }
}
