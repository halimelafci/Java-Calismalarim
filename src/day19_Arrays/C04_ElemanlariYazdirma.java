package day19_Arrays;

import java.util.Arrays;

public class C04_ElemanlariYazdirma {
    public static void main(String[] args) {
        int sayilar[] = {1, 2, 3, 4, 5, 6, 7};
        // array'in tamamini yazdirsak bu sekilde olur
        System.out.println(Arrays.toString(sayilar)); // [1, 2, 3, 4, 5, 6, 7] array oldugu icin parantezli

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i] + " ");//1 2 3 4 5 6 7 forloop ile yazdirinca bu sekilde olur

    }
}}
