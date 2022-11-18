package day20_Arrays2;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {

        /*
         binarySearch method'u siralanmis array'de aradigimiz elementin index'ini dondurur
         Ya aradigimiz element array'de yoksa ?
         (String'de indexOf() bize olmayan elementler icin -1 donduruyordu)
        Aradigimiz element array'de yoksa Java hem olmadigini,
        hem de olsaydi nerede olacagini bize dondurur
        olmadigini ifade icin - kullanir
        olsaydi nerede olacagini belirtmek icin index degil siralama kullanir
         */
        int[] sayilar={4,5,9,23,43,6,8,0};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));//0, 4, 5, 6, 8, 9, 23, 43
        // once sort ile sıraladik.
        System.out.println(Arrays.binarySearch(sayilar,5));
        System.out.println(Arrays.binarySearch(sayilar,8));
        System.out.println(Arrays.binarySearch(sayilar,-2));
    }
}
