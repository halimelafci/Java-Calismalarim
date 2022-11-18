package day08_TernaryOperator;

import java.util.Scanner;

public class C03_NestedTernary {
    public static void main(String[] args) {

        // Soru2 : Kullanicidan bir harf isteyin
        // kucuk harf ise consola “Kucuk Harf” ,
        // buyuk harfse consola “Buyuk Harf”
        // yoksa “girdiginiz karakter harf degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir harf girin");
        char harf=scan.next().charAt(0);
        System.out.println(harf >='a'&& harf<='z' ? "kücük harf": harf>='A' && harf<='Z'? "büyük harf" :
                "girdiginiz karakter harf degil");

    }
}
