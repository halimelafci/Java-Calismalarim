package day19_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int[] sayilar=new int[5];
        System.out.println(sayilar);//[I@19dfb72a
    // arrays de sout icerisinde yazdirirken array methodundan yardim almak lazim aksi halde referansini yazdiri
        System.out.println(Arrays.toString(sayilar));//[0, 0, 0, 0, 0]
        // arrayin kapasitesinin 5 oldugunu belirttik ama icerisindeki sayilari yazmadigimiz icin 0 diye gosterdi

     sayilar [0]=10;
     sayilar [1]=8;
     sayilar [2]=5;
     sayilar [3]=11;
     sayilar [4]=12;
        // simdi 5 elementli arraye sayilari tanimladik
        System.out.println(Arrays.toString(sayilar));//[10, 8, 5, 11, 12]
        String[] sinifListesi ={"halime, burak, lafci"};
        System.out.println(Arrays.toString(sinifListesi));//[halime, burak, lafci]
        sinifListesi[0]="ali";
        System.out.println(Arrays.toString(sinifListesi));

    }
}
