package day21_practice;

import java.util.Locale;
import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
         /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u
     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.
     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.
     Test Data:

       we  yada  %
     Beklenen Çıktı:
     Yanlis karakter girdiniz!
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf girin");
        String harf=scan.next().toLowerCase();
        String sesliharfler= "a,e,i,o,u";
        String sessizHarfler="b,c,d,f,g,h,j,k,l,m,n,r,p,s,v,y,z,q,x,w";

        if( sesliharfler.contains(harf)){
            System.out.println("sesli harf");}

        else if (sessizHarfler.contains(harf)) {
            System.out.println(" girilen harf sessiz harf");

        }else {System.out.println("hatali giris yaptiniz");

        }
    }

    }

