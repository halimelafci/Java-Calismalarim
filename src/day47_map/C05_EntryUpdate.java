package day47_map;

import day46_maps.ResuableMethods;

import java.util.Map;
import java.util.Set;

public class C05_EntryUpdate {
    public static void main(String[] args) {

        //soyismi can olanlari branslarini DataScience yapalim

        Map<Integer,String> listMap= ResuableMethods.mapOlustur();
        Set<Map.Entry<Integer,String>> listEntry=listMap.entrySet();

        String values;
        String arr [];
        for (Map.Entry<Integer,String> each:listEntry ) {
            values=each.getValue();
            arr=values.split(", ");
            if (arr[1].equals("Can")) {
                arr[2] = "DataScience";


                values = arr[0] + ", " + arr[1] + ", " + arr[2];
                each.setValue(values);
            }
        }

        System.out.println(listMap);
    }
}
