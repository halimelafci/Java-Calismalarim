package day02_Scanner;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan iki tam sayı alıp sayıların toplam fark veçarpımını yazdırın.
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki tam sayı giriniz.");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        System.out.println("iki sayının toplamı:" + (sayi1 + sayi2));
        System.out.println("iki sayının farkı" + (sayi1 - sayi2));
        System.out.println("iki sayının çarpımı:" + (sayi1 * sayi2));

        //kullanıcıdan karenin kenar uzunlugunu isteyin ve karenin
        //çevresini ve alanını hesaplayın.

        System.out.println("lütfen karenin 1 kenar uzunluğunu girin");
        int kenarUzunlugu=scan.nextInt();
        System.out.println("karenin çevresi:"+(4*kenarUzunlugu));
        System.out.println("karenin alanı:"+(kenarUzunlugu*kenarUzunlugu));

        //çemberin çevresini,dairenin alanını hesaplayınız.

        System.out.println("lütfen yarıçap girin");
        double yarıcap=scan.nextDouble();
        System.out.println("çemberin çevresi:"+2*3.14*yarıcap);
        System.out.println("dairenin alanı:" +3.14*yarıcap*yarıcap);

        // Kullanıcıdan dikdörtgenler pirizmasının uzun ve kısa kenarlarını ve yüksekliğini
        // isteyip hacmini hesaplayın.
        System.out.println("lütfen diktörtgenler pirizmasının uzun,kısa kenarlarını ve yüksekliğiğni girin");
        double uzunKenar=scan.nextDouble();
        double kısaKenar=scan.nextDouble();
        double yukseklik=scan.nextDouble();
        System.out.println("dikdörtgenler pirizmasının hacmi:"+ uzunKenar*kısaKenar*yukseklik);

        // kullanıcıdan isim soyisim isteyıp teşekkur edin.
        System.out.println("lütfen isminizi ve soyisminizi girin");
        String isim=scan.nextLine();
        String soyisim=scan.nextLine();
        System.out.println("isminiz:"+isim);
        System.out.println("soyisminiz:"+soyisim);
        System.out.println("kursumuza katılımınız alınmıştır tesekkür ederiz.");


    }
}