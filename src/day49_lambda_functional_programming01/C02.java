package day49_lambda_functional_programming01;

import java.util.ArrayList;
import java.util.List;

public class C02 {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);//[8, 9, 131, 10, 9, 10, 2, 8]

        listElemanlari(liste);//8 9 131 10 9 10 2 8
        System.out.println();
        ciftElemanlariYazdir(liste);//8 10 10 2 8
        System.out.println();
        tekListeninElemanlarininKaresi(liste);//81 17161 81
        System.out.println();
        tekElemanlarinKupleriniTekrarsizYazdirma(liste);//729 2248091
        System.out.println();
        tekrarsizCiftElemanlarinKarelerininToplami(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKupununCarpimi(liste);
        System.out.println();
        maxValue(liste);

    }
    //1) Ardışık list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran
        // bir method oluşturun.(Functional ve method reference)
      public static void listElemanlari(List<Integer>list){
        list.stream().forEach(Utils::boslukluYazdirma);
      }
    //2)Ardışık çift list elementlerini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElemanlariYazdir(List<Integer>list){

        list.stream().filter(Utils::ciftElemanSec).forEach(Utils::boslukluYazdirma);

    }
    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.(Functional)
   public static void tekListeninElemanlarininKaresi(List<Integer>list){

        list.stream().filter(Utils::tekElemanlariSec)
                .map(Utils::tekElemanlarinKupu).forEach(Utils::boslukluYazdirma);
    }
    //4) Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı satırda
    // aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekElemanlarinKupleriniTekrarsizYazdirma(List<Integer>list){

        list.stream().distinct().filter(Utils::tekElemanlariSec).map(Utils::kupunuAl).forEach(Utils::boslukluYazdirma);
    }

    //5)tekrarsiz cift elemanlarin karelerinin toplami hesaplayın
    public static void tekrarsizCiftElemanlarinKarelerininToplami(List<Integer>list){
      Integer toplam=  list.stream().distinct().filter(Utils::ciftElemanSec).map(Utils::karesiniAl).reduce(Math::addExact).get();
    }
    //6)tekrarsiz cift elemanlarin küpünün carpimini hesaplayan method yazin
    public static void tekrarsizCiftElemanlarinKupununCarpimi(List<Integer>list){
    Integer carpim= list.stream().distinct().filter(Utils::ciftElemanSec).map(Utils::kupunuAl).reduce(Math::multiplyExact).get();

        System.out.println(carpim);
    }
    //7)list elemanlari arasindan en buyuk degeri bulan methot olustrun
    public static void maxValue(List<Integer>list){
        Integer maxVlue=list.stream().reduce(Math::max).get();
        System.out.println(maxVlue);
    }
    //8)list elemanlari arasinda en kucuk degeri bulan bir methot olusturun
    public static void minValue(List<Integer>list){

    }

}
