package day07_nestedIfElse;

import java.util.Scanner;

public class C01_NestedIfElseEmeklilik {
    public static void main(String[] args) {
/*
          emeklilik kontrolu yapan bir program yaziniz
          cinsiyet olarak E (erkek) veya K(Kadin) degiskenlerini kabul etsin
          farkli bir harf veya sembol girilirse hata mesajji versin
          emeklilik icin kadinlarda yas siniri 60
          erkeklerde 65 olsun
          negatif yas veya 80'den buyuk yas girilirse hata mesaji versin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi girin" );
        char ilkHarf=scan.next().toUpperCase().charAt(0);
        System.out.println("lütfen yaşınızı girin");
        double yas=scan.nextDouble();
        if (yas<0||yas>80){
            System.out.println("lütfen gecerli bir yas girin");
        }

        else if (ilkHarf=='E'){
            if (yas>65){
                System.out.println("emekli olabilirsiniz");
            } else {
                System.out.println("emekli olamazsınız");
            }
        } else if (ilkHarf=='K'){
            if (yas>60){
                System.out.println("emekli olabilirsiniz");

            }else {
                System.out.println("emekli olamazsın");
            }
        } else {
            System.out.println("hatalı giris");
        }


   }
}
