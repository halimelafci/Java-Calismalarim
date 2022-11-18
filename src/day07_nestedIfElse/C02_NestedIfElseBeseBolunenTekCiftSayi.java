package day07_nestedIfElse;

import java.util.Scanner;

public class C02_NestedIfElseBeseBolunenTekCiftSayi {
    public static void main(String[] args) {

        /*
        Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        Girdiği sayi 5’e     bölünüyorsa son rakamını kontrol edin.
        Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
        Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        Girdiği sayi 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.

        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen dört basamaklı bir sayı girin");
        double sayi=scan.nextDouble();
        if (sayi<1000 ||sayi>9999){
            System.out.println("lütfen dört basamaklı bir sayı girin");

        } else if (sayi %5 ==0){
            if (sayi %10==0){
                System.out.println("bese bölünen cift sayı");

                }else {
                System.out.println("bese bölünen tek sayı");
            }
        } else {
            System.out.println("tekrar deneyin");
        }

        }

    }


