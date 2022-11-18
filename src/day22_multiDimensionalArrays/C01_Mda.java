package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {
     /* tek katli arraylerde array'i direk yazdiramiyoruz
        cunku array non-primitive data turudur ve
        her non-primitive data direk yazdirilamayabilir
        ancak array'in icerisindeki elementleri direk yazdirabiliyorduk
        cunku genelde primitive data turu veya String elementler kullaniliyordu.
        Multi-dimensional array'lerde en dikkat edecegimiz konu
        ulasmak istedigimiz elementin bir array mi yoksa
        primitive data mi oldugudur */

        int [][] sayilar={{2,6,7,8},{9,0,4}};

        /*
        burada sayilar arrayini dusunursek icinde 2 tane inner array var
        sayilar[0] ==> (2,6,7,8)
        ancak en icerdeki elementlere ulasairsak direk yazdirabiliriz*/
        System.out.println(sayilar);// referansini verir bize [[I@19dfb72a
        System.out.println(Arrays.toString(sayilar [0]));//[2, 6, 7, 8] sayilarin 0 index yazdirir.
        System.out.println(Arrays.toString(sayilar[1]));//[9, 0, 4]
        System.out.println(Arrays.deepToString(sayilar));//[[2, 6, 7, 8], [9, 0, 4]] deep methodu ile ic arrayleri
        //sorunsuz direkt yazdiririz ama Array olarak

    }
}
