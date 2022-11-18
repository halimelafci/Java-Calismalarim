package day07_ifElseOdevler;

import java.util.Scanner;

public class C05_OdevtekCiftSayi {
    public static void main(String[] args) {
       //kullanıcıdan bir tam sayı isteyin ve sayı çift mi tek mi yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println(" lütfen bir tam sayı girin");
        int tamSayı= scan.nextInt();

        if (tamSayı%2==0){
        System.out.println("sayı cift");}
        else {
            System.out.println("sayı tek");
        }

    }
}
