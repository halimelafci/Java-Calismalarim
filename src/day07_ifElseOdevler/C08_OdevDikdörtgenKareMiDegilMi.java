package day07_ifElseOdevler;

import java.util.Scanner;

public class C08_OdevDikdörtgenKareMiDegilMi {
    public static void main(String[] args) {
     // kullanıcıdan dikdörtgenin kenar uzunluklarını isteyin ve kare olup olmadıgını yazdırın

     Scanner scan = new Scanner(System.in);
        System.out.println("lütfen dikdörtgenin kenar uzunluklarını girin");
        double uzunluk1=scan.nextDouble();
        double uzunluk2=scan.nextDouble();
        if(uzunluk1==uzunluk2){
            System.out.println("kare");
        }else {
            System.out.println("dikdörtgen");
        }

    }
}
