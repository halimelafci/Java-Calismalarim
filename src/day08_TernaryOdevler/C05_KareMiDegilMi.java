package day08_TernaryOdevler;

import java.util.Scanner;

public class C05_KareMiDegilMi {
    public static void main(String[] args) {


        //kullanicidan dikdörtgenin uzunlugunu ve genisligini alin,
        //girilen degere göre kare olup olmadigini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println( "dikdörtgenin uzunlugunu girin");
        int uzunluk=scan.nextInt();
        System.out.println("dikdörtgenin genisligini girin");
        int genislik=scan.nextInt();

        System.out.println(uzunluk==genislik ? "kare": "kare degil" );

    }
}
