package day07_ifElseOdevler;

import java.util.Scanner;

public class C07_OdevHaftaIciHaftasonu {
    public static void main(String[] args) {
     // kullanıcıdan bır gün isteyin ve haftaci mi haftasonu mu yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen gün ismi girin.");
        String gunIsmi = scan.next().toLowerCase();

        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") || gunIsmi.equals
                ("pesembe") || gunIsmi.equals("cuma")) {
            System.out.println("haftaiçi");

        } else if (gunIsmi.equals("cumartesi") || gunIsmi.equals("pazar")) {
            System.out.println("haftasonu");

        } else {
            System.out.println("lütfen gecerli bir gün girin");
        }
    }
}
