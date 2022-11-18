package day04_Pre_Post_İncrement;

import java.util.Scanner;

public class C03_Matematik_İşlemler {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen dört basamaklı bir sayı girin");
        int sayi=scan.nextInt();

        //toplam değer atanacak
        //birler basamağı değeri atanacak
        //girilen sayıyı tutmak için bir değer atanacak
        //birler basamağını bulmak için mod alınır
        //birler basamağını çıkarmak için 10'a bölünür
        //4 basamaklı istendiği için 4 defa tekrar ediiıyorsun


           int birlerBasmagi=0;
           int toplam=0;
            int ilksayı=sayi;
            //5643
            birlerBasmagi=sayi%10;  //3
            toplam+=birlerBasmagi;  //3
            sayi/=10;   //564

            birlerBasmagi=sayi%10;  //4
            toplam+=birlerBasmagi;      //7
            sayi/=10;                   //56

            birlerBasmagi=sayi%10;  //6
            toplam+=birlerBasmagi;  //13
            sayi/=10;    //5

           birlerBasmagi=sayi%10;   //5
           toplam+=birlerBasmagi;  //18
           sayi/=10;    //0


        System.out.println(ilksayı+" sayısının rakamlar toplamı="+ toplam);






    }
}
