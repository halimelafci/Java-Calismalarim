package day12_stringManipulation;

import java.util.Scanner;

public class C12_OdevAltı {
    public static void main(String[] args) {


        //Kullanicidan bir sifre girmesini isteyin.Asagidaki satlari sagliyorsa "Sifre basari ile tanimlandi",
        //sartlari saglamazsa "Islem basarisiz,Lütfen yeni bir sifre girin" yazdirin
        //ilk harf büyük harf olmali
        //Son harfi kücük harf olmali
        //Sifre bosluk icermemeli
        //Sifre uzunlugu en az 8 karakter olmali

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen sifre girin");
        String sifre= scan.nextLine();

        if ((sifre.charAt(0)>='A'&&sifre.charAt(0)<='Z')&&
        (sifre.charAt(sifre.length()-1)>='a'&& sifre.charAt(sifre.length()-1)<='z')&&(!sifre.contains(" "))
                &&( sifre.length()>=8)){

            System.out.println("Sifre basari ile tanimlandi");}


        else {
            System.out.println("Islem basarisiz,Lütfen yeni bir sifre girin");
        }




    }
}
