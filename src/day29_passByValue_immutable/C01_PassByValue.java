package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        4 elemnli bir method olusturalim ve bir method olustrup bu arrayin 2. ve 4. rakamlarini
        rastgele bir sayi ile degistirelim
        yeni halini yazdiralim

         */
        int [] arr={5,7,8,10};

         elemanDegistir(arr);
        System.out.println("main method icinde diger method degistikten sonra : "+Arrays.toString(arr));
        //beklenen deger {5,7,8,10} ama cıkan sonuc  [5, 92, 8, 49] cunkubir onceki indirimli fiyat classda oldugu gibi
        // kopyasında isşiem yapıp yukari gondermiyor direkt orjinal arr uzerinde işlem yapidı
    }

    private static void elemanDegistir(int[] arr) {
        Random rnd=new Random();
        arr[1]=rnd.nextInt(100);
        arr[3]=rnd.nextInt(100);
        System.out.println(Arrays.toString(arr));

    }

}
