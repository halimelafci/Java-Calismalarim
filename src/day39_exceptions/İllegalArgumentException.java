package day39_exceptions;

import java.util.Scanner;

public class İllegalArgumentException {
    public static void main(String[] args) {

       //Soru: Kullanicidan yasini girmesini isteyin.
        // Kodunuzu kullanici sifirdan kucuk bir sayi girerse
        // Exception verecek sekilde yazin.


        Scanner scan = new Scanner(System.in);
        System.out.println("yasini giriniz");
        int yas = scan.nextInt();

        try {
            if (yas<0){
                throw new IllegalArgumentException();//burda kullanıcıya exception firlattik
            } else
                System.out.println(yas);
        } catch (IllegalArgumentException e) {//burda ise kodumuzun cokmemesi icin try yaptik
            System.err.println("yas 0 dan kucuk olamaz");
        }
    }
}
