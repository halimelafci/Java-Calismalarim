package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {

        //arraydeki elemanlari tekrarsiz bicimde array olarak yazin

        int arr[]={4,5,2,7,8,4,2,7,6,8,4,3,5,3};

        Set<Integer> tekrarsizSet=new  HashSet<>();
        for (Integer each:arr) {
         tekrarsizSet.add(each)  ;

        }
        System.out.println("tekrarsiz set : "+tekrarsizSet);

        int tekrarsizArr[]=new int[tekrarsizSet.size()];
        int i=0;
        for (int each:tekrarsizSet  ) {
        tekrarsizArr[i]=each;
        i++;

        } arr=tekrarsizArr;

       System.out.println("arr'nin son hali : "+Arrays.toString(tekrarsizArr));
    }
}
