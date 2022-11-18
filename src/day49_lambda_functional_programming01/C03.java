package day49_lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C03 {
    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);
        tumElemanlariBuyukHarfYazdir(liste);
        System.out.println();
        uzunlugaGoreSiralama(liste);
        System.out.println();
        uzunlugaGoreTerstenSirala(liste);
        System.out.println();
        sonKaraktereGoreSiralaTekrarsizYadir(liste);
        System.out.println();
        ilkKaraktereGoreSiralaTekrarsizYadir(liste);
        System.out.println();
       // bestenBuyukElemanlariSil(liste);
       // AileBaslayanYadaNileBitenElemanlariSil(liste);
       // uzunlugu8İle10ArasindaYadaOileBitenleriSil(liste);
        System.out.println( elemanalrinUzunluklari12denAzMi(liste));
        System.out.println(hicbiriXleBaslamiyorMu(liste));
        System.out.println(rİleBitiyorMu(liste));

    }
    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    public static void tumElemanlariBuyukHarfYazdir(List<String>list){
       list.stream().map(String::toUpperCase).forEach(Utils::boslukluYazdirma);

    }
    /*2.yol
    public static void tumElemanlariBuyukHarfYazdir2(List<String>list){
      list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }
    */

    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.

    public static void uzunlugaGoreSiralama(List<String>list){

        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::boslukluYazdirma);
    }
    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.

    public static void uzunlugaGoreTerstenSirala(List<String>list){
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::boslukluYazdirma);
    }
    //4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.

    public static void sonKaraktereGoreSiralaTekrarsizYadir(List<String>list){

        list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakteriAl)).forEach(Utils::boslukluYazdirma);
    }
    //5) Elemanları önce uzunluklarına göre ve sonra ilk karakterine göre sıralayıp yazdıran bir method oluşturun.

    public static void ilkKaraktereGoreSiralaTekrarsizYadir(List<String>list){
   list.stream().sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakteriAl)).forEach(Utils::boslukluYazdirma);
    }
    //6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.

   /* public static void bestenBuyukElemanlariSil (List<String>list){

        list.removeIf(t->t.length()>5);
        System.out.println(list);
    }

    */
    //7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.

   /*public static void AileBaslayanYadaNileBitenElemanlariSil(List<String>list){
       list.removeIf(t->t.charAt(0)==('A')||t.charAt(0)==('a')||t.endsWith("N")||t.endsWith("n"));
       System.out.println(list);

}
 */
    //8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları silen bir method oluşturun.

   /* public static void uzunlugu8İle10ArasindaYadaOileBitenleriSil(List<String>list){
        list.removeIf(t->t.length()>=8&&t.length()<=10||(t.charAt(t.length()-1)=='o'));
        System.out.println(list);
    }
    */
    //9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.
    public static boolean elemanalrinUzunluklari12denAzMi(List<String>list){
        return list.stream().allMatch(t->t.length()<12);
    }
    //10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.
    public static boolean hicbiriXleBaslamiyorMu(List<String>list){
        return list.stream().noneMatch(t->t.startsWith("x"));
    }
    //11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.
    public static boolean rİleBitiyorMu(List<String>list){
        return list.stream().anyMatch(t->t.endsWith("r"));
    }
}
