package day20_Arrays2;

import java.sql.Array;
import java.util.Arrays;

public class C07_sort {
    public static void main(String[] args) {

        //Arrayi Arrays classini kullanarak natural sıralı hale getiririz
        int[] sayilar={56,54,8,2,6,9,};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));//2, 6, 8, 9, 54, 56
        // sort methodu ile karmasik sayılari sırali hale getirir.
    }
}
