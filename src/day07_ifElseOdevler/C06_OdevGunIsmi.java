package day07_ifElseOdevler;

import java.util.Scanner;

public class C06_OdevGunIsmi {
    public static void main(String[] args) {

        //kullanıcıdan bir gün isminin ilk harfini isteyin ve o gün ile baslayan günü yazdırın.


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen gün isminin baş harfini girin.");
        char basHarf = scan.next().toUpperCase().charAt(0);
        if (basHarf == 'P') {
            System.out.println("pazar ,pazartesi ,persembe");
        } else if (basHarf == 'S') {
            System.out.println("sali");
        } else if (basHarf == 'C') {
            System.out.println("carsamba, cuma, cumartesi");

        } else {
            System.out.println("lütfen gecerli harf girin");
        }
        }
    }

