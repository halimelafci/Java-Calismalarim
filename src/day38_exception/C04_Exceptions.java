package day38_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Exceptions {
    public static void main(String[] args) {
        String[]urunler={"nutella","cay","seker","sut"};
     Scanner scan;
     int istenenSira=0;
     boolean kontrol=true;

     while (kontrol){

        try {
           scan=new Scanner(System.in);
            System.out.println("istediginiz urunun sirasini girin");

           istenenSira=scan.nextInt();
            kontrol=false;


        } catch (InputMismatchException e) {

            System.out.println( "Urun indexi icin  bir sayi giriniz");

        }
        }

        try {
            System.out.println("Aradiginiz urun : " + urunler[istenenSira -1]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz sira listemizde bulunmuyor" +"\nSira numarasi en fazla : "
                     + urunler.length  + " olabilir" );

        }
    }
}

