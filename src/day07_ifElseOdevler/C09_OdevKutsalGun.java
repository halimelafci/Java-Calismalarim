package day07_ifElseOdevler;

import java.util.Scanner;

public class C09_OdevKutsalGun {
    public static void main(String[] args) {

        //kullanıcıdan bir gün ismi isteyin ve eger cuma girerse "müslümanlar için kutsal" gün,
        //eger cumartesi girerse" yahudiler için kutsal gün"," eger pazar girerse" "hristiyanlar için kutsal gün" yazdırın

        Scanner scan= new Scanner (System.in);
        System.out.println("lütfen bir gün ismi girin");
        String günIsmi= scan.next().toLowerCase();
        if (günIsmi.equals("cuma")){
            System.out.println( "müslümanlar için kutsal gün");
        } else if (günIsmi.equals("cumartesi")){
            System.out.println("yahudiler için kutsal gün");
        }else if (günIsmi.equals("pazar")){
            System.out.println("hristiyanlar için kutsal gün");
        }else {
            System.out.println("lütfen gecerli bir gün girin");
        }


    }
}
