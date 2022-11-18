package day15_ReplitSorulari;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {

       /* Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını
       ve çevresini konsola yazdıran bir program yazın.

           Örnek Çıktı:
               Alan: 32
              Çevre: 24
            */
        Scanner scan =new Scanner(System.in);
        System.out.println("dikdortgenin uzun kenar uzunlugunu girin");
     int uzunKenar=scan.nextInt();
        System.out.println("dikdortgenin kısa kenar uzunlugunu girin");
       int kısaKenar=scan.nextInt();

        int alan=uzunKenar*kısaKenar;
        int cevresi=uzunKenar+kısaKenar+uzunKenar+kısaKenar;
        System.out.println("Alan: " + alan);
        System.out.println( "Cevresi: " + cevresi);

    }
}
