package day15_ReplitSorulari;

import java.util.Scanner;

public class C02_Iki {
    public static void main(String[] args) {

        //Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi girin");
        int sayi=scan.nextInt();
        int sayi2=sayi*sayi*sayi;
        System.out.println(sayi2);
        System.out.println(sayi2/2);


    }
}
