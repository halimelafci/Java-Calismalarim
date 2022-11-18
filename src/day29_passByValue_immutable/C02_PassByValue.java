package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
           verilen 4 elemanli bir array'i
           method'a gonderelim
           method'da yeni 3 elemanli bir array atayip
           bu yeni array'e rastgele 100'den kucuk 3 sayi atayalim
           method da arrray'i yazdiralim
           main method'da da method call'dan sonra yeniden arr'yi yazdiralim
         */

        int[] arr={3,5,8,10};

        arrayiDegistir(arr);
        System.out.println("method calistiktan sonra arr :"+Arrays.toString(arr));
        //assagıdaki methodda yeni bir arr olusturuldugundan referansi degistigi icin
        // main icindeki arr ayni referansta kaldigi icin degismez

    }

    private static void arrayiDegistir(int[] arr) {

        arr =new int[3];
        Random rnd=new Random();
        arr[0]=rnd.nextInt(100);
        arr[1]=rnd.nextInt(100);
        arr[2]=rnd.nextInt(100);
        System.out.println("method icindeki arr : "+ Arrays.toString(arr));


    }
}
