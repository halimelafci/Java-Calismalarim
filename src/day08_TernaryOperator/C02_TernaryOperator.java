package day08_TernaryOperator;

public class C02_TernaryOperator {
    public static void main(String[] args) {

      //  Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
          // mutlak degeri bulmak icin sayı pozitif ise kendisini yazdırır negatif ise -1 ile carpımı ile bulunur.
        int sayi=-10;
        System.out.println(sayi>=0 ? sayi : (sayi*-1));

        // Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin,
        // negatifse sayinin karesini yazdirin

        int sayi2=-18;
        //iki farklı data türünde işlem yapılacagı icin atama olamaz direkt yazdırma ile yapılır.

        System.out.println(sayi2>0 ? "pozitif sayı" : (sayi2*sayi2));


    }
}
