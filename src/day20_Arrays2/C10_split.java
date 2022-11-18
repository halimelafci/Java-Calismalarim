package day20_Arrays2;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {
        //split Arrays methodu degil String methodudur ama array donderir sonuc olarak
        // string ifadeyi istedigimiz yerden parcalara ayirir.
        String str="java cok guzel  degil mi";
       String[] cumle=str.split("cok");
        System.out.println(Arrays.toString(cumle));//[java ,  guzel  degil mi]
        String[] bosluk=str.split("");
        System.out.println(Arrays.toString(bosluk));
        //[j, a, v, a,  , c, o, k,  , g, u, z, e, l,  ,  , d, e, g, i, l,  , m, i]


    }
}
