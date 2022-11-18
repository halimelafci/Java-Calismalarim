package practice03;

import java.util.ArrayList;
import java.util.List;

public class C04 {
    public static void main(String[] args) {
        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullanmayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */
        int[]arr={2,5,-9,45,43,11,8,102,102,47,47,0};
        int n=4;
        //bir liste olusturalim

        List<Integer> list=new ArrayList<>();
        //listeye elemanlari ekleyelim

        for (int each:arr){
             list.add(each);
        }
        List<Integer>maxSayi=new ArrayList<>();
        int sayac=1;

        while (sayac<=n){
            int max=list.get(0);  //listenin ilk elemani max olsun
            for (int i = 0; i <list.size() ; i++) {
                if (list.get(i) > max &&!(maxSayi.contains(list.get(i)))) {
                    max = list.get(i);
                }
            }
            maxSayi.add(max);
            sayac++;
        }

            System.out.println("Arrayin max "+n+" elemani : "+maxSayi);
    }
}
