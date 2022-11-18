package day08_TernaryOdevler;

import java.util.Scanner;

public class C04_Matematikselİslem {
    public static void main(String[] args) {

        //kullanicidan bir sayi alin ve sayi 3 basamakli ise üc basamakli yazdirin
        //degilse üc basamakli degildir yazdirin


        Scanner scan= new Scanner(System.in);
        System.out.println( "bir sayı girin");
        int sayi=scan.nextInt();
        System.out.println(sayi>=100 && sayi<=999 ?"sayı 3 basamaklı" :"sayı 3 basamaklı degil");


    }
}