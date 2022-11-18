package day13_methodCreation;

import java.util.Scanner;

public class C05_methodCreationReturn {
    public static void main(String[] args) {


        //verilen iki sayiyi carpip sonucu bize döndüren bir method olustutun


      int carpim= carpGetir();

        System.out.println("iki sayinin carpimi:" +carpim);

    }

    private static int carpGetir() {

        Scanner scan=new Scanner(System.in);
        System.out.println("birinci sayiyi girin");
        int sayi1=scan.nextInt();
        System.out.println("ikinci sayiyi girin");
        int syi2=scan.nextInt();
        int carpma=sayi1*syi2;

        return carpma;

    }


}




