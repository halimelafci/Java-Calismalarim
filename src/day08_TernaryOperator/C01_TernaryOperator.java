package day08_TernaryOperator;

public class C01_TernaryOperator {
    public static void main(String[] args) {
        // ternary operatorleri ile if lerdeki basit işlemleri yaparız.
        // ternary operatorlerinde ya sautun içinde direkt yazdırırz yada atama yaparız
      // sayinin tek mi cift mi oldugunu yazdırın
        int sayi=10;
        System.out.println( sayi%2==0 ?"cift":"tek");
        //simdi de atama yaparak yapalım
        String sonuc=sayi%2==0 ?"cift":"tek";
        System.out.println(sonuc);

    }
}
