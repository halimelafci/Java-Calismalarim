package day47_map;

import day46_maps.ResuableMethods;

import java.util.Map;

public class C01_DununTekrari {
    public static void main(String[] args) {


        Map<Integer,String>sinifListesiMap= ResuableMethods.mapOlustur();

        System.out.println(sinifListesiMap);

        ResuableMethods.bransOgrenciSayisiYazdir(sinifListesiMap);



    }
}
