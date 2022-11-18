package day49_lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C01 {
    public static void main(String[] args) {


        //1)list elementlerini aynı satırda aralarında boşluk bırakarak
        // yazdıran bir method oluşturun.(Structured)

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

        //stream(). methodu ile lamda methotlarini kullaniriz

        listElemanlariniYazdir(liste);
        System.out.println();
        ciftSayiElemanlariniYazdir(liste);
        System.out.println();
        tekElemanlarinKaresi(liste);
        System.out.println();
        tekElemanlarinKupleriniYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinToplami(liste);
        tekrarsizCiftElemanlarinKupununCarpimi(liste);
        maxEleman(liste);
        minEleman(liste);
        getYedidenBuyukCiftMin(liste);
        tekrarsizBestenBuyukElemanlarininYarisiniYazdir(liste);

    }

    public static void listElemanlariniYazdir(List<Integer> list) {

        list.stream().forEach(t -> System.out.print(t + " "));//8 9 131 10 9 10 2 8
    }
    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.(Functional)

    public static void ciftSayiElemanlariniYazdir(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));//8 10 10 2 8

    }

    //3) Ardışık tek list elemanlarinin karelerini aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarinKaresi(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 1).map(t -> t * t).forEach(t -> System.out.print(t + " "));//81 17161 81
    }

    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekElemanlarinKupleriniYazdir(List<Integer> list) {

        list.stream().filter(t -> t % 2 == 1).distinct().map(t -> t * t * t).forEach(t -> System.out.print(t + " "));//729 2248091
    }

    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinToplami(List<Integer> list) {

        Integer toplam = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);

        System.out.println(toplam);//168
    }
    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKupununCarpimi(List<Integer> list) {
        Integer carpim = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);
        System.out.println(carpim);//4096000
    }
    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

    public static void maxEleman(List<Integer> list) {

        Integer max = list.stream().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
        System.out.println(max);//131
        // max istedigi icin ilk degere min atadik sonra kıyaslama yapmaya basladik ve en buyuk sayi bulduk
    }
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)


    public static void minEleman(List<Integer> list) {

        Integer min = list.stream().sorted(Comparator.reverseOrder()).reduce(Integer.MIN_VALUE, (t, u) -> u);
        System.out.println(min);//2
    }
     //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.

    public static void getYedidenBuyukCiftMin(List<Integer> list) {
     Integer  deger= list.stream().sorted().filter(t->t%2==0&&t>7).findFirst().get();
        System.out.println(deger);//8

    }
    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların
    // yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
    public static void tekrarsizBestenBuyukElemanlarininYarisiniYazdir(List<Integer> list){
   List<Double> sonuc= list.stream().distinct().sorted(Comparator.reverseOrder())
           .filter(t->t>5).map(t->t/2.0).collect(Collectors.toList());

        System.out.println(sonuc);//[65.5, 5.0, 4.5, 4.0]
    }


}