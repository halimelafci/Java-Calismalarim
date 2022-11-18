package day07_ifElseOdevler;

import java.util.Scanner;

public class C10_OdevHarfMiDegilMi {
    public static void main(String[] args) {

        //kullanıcıdan bir karakter girmesini isteyin ve harf mi degil mi yazdırın

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir  karakter girin");
        char karakter= scan.next().toUpperCase().charAt(0);
         if ((karakter>='A')&&(karakter<='Z')){
             System.out.println("girilrn karakter bir harf");
         }else {
             System.out.println("girilrn karakter harf degil");
         }
    }
    }



