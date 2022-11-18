package day47_map;

import java.util.HashMap;
import java.util.Map;

public class C02_TekrarSayisiBulma {
    public static void main(String[] args) {
        /*
        verilen bir stringde kullanilan harfleri ve kullanilan harflerin tekrar sayisini
        h=7 seklinde yadirin
         */

        String str="hheeeeeeeelllllllooo Wooorrrrrrrllllllllldddddddddd";
        str=str.replaceAll("\\W","");
        String harf[]=str.split("");
        Integer harfSonSayi;

        Map<String,Integer>harfsayisiMap=new HashMap<>();

        for (String each:harf ) {
            if (!harfsayisiMap.containsKey(each)){
                harfsayisiMap.put(each,1);
            }else {
                harfSonSayi=harfsayisiMap.get(each);
                harfsayisiMap.put(each,++harfSonSayi);
            }

        }
        System.out.println(harfsayisiMap);//{r=7, d=10, e=8, W=1, h=2, l=16, o=6}
    }
}
