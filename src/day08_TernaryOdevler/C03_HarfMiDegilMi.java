package day08_TernaryOdevler;

import java.util.Scanner;

public class C03_HarfMiDegilMi {
    public static void main(String[] args) {


        //kullanıcıdan bir harf isteyin kücükse kücük
        //büyükse büyük degilse girdiginiz karakter harf degildir yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir harf girin");
        char harf=scan.next().charAt(0);
        System.out.println(harf>='a'&& harf<='z' ? "kücük harf"
                : (harf>='A' && harf<='Z' ? "büyük harf" : "girilen harf degil"));
    }
    }

