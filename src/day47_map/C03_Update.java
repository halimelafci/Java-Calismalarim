package day47_map;

import day46_maps.ResuableMethods;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C03_Update {

    public static void main(String[] args) {



     /*
        map.contans(key)==>verdigimiz key'in map de olup olmadigini boolen olarak döner
        map.contans(value)==>bir butun olarak valuenin map de olup olmadiginı döner

        Not : map.contans(value)valuenin icindeki bir parcanin var oldgunu bulmada ise yaramaz
         */

        Map<Integer,String>sinifListesiMap= ResuableMethods.mapOlustur();

        System.out.println(sinifListesiMap);

        System.out.println(sinifListesiMap.containsKey(102));//true
        System.out.println(sinifListesiMap.containsKey(120));//false

        //

        Set<Integer>keyValue=sinifListesiMap.keySet();



        for (Integer each:keyValue ) {
            String value=sinifListesiMap.get(each);//keyi yazıp valuede degisklik yaptik

          value=value.replaceAll("Tester","QA");
          sinifListesiMap.put(each,value);


        }
        System.out.println(sinifListesiMap);
} }
