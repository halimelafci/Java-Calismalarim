package practice07_okulProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class İslemler {


    static List<Kisi> ogretmenList=new ArrayList<>();
    static List<Kisi> ogrenciList=new ArrayList<>();
    static Scanner scan=new Scanner(System.in);
    static String kisiTuru;


    public static void girisPaneli(){

        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");

        String secim=scan.next().toUpperCase();

        switch (secim){

            case "1":
               kisiTuru ="OGRENCİ";
                islemMenusu();

              break;
            case "2":
               kisiTuru="OGRETMEN" ;
               islemMenusu();

             break;
            case "Q":

                break;
            default:
                System.out.println("hatali giris ");
                girisPaneli();
                break;
        }


    }
    private static void cikis(){
        System.out.println("isleminiz sonlandirilmistir..");

    }
    private static void silme(){
        System.out.println("*** "+kisiTuru+" silme sayfasina hosgeldiniz");
        scan.nextLine();
        System.out.println("ad soyad giriniz");
        String adSoyad=scan.nextLine();
        System.out.println("kimlik girin");
        String kimlikNo=scan.nextLine();

        if (kisiTuru.equals("OGRENCİ")){
            if (ogrenciList.isEmpty()){
                System.out.println("bu liste bos silemezsin");
            }
            for (int i = 0; i <ogrenciList.size() ; i++)
        {if (ogrenciList.get(i).getAdSoyad().equals(adSoyad)&&ogrenciList.get(i).getKimlikNo().equals(kimlikNo)){

            System.out.println("girdiginiz "+adSoyad+" listeden silindi"+ogrenciList.remove(i));  }

        else {
            System.out.println("girdiginiz "+ adSoyad+ " listede mevcut degil");  }



            }
        } if (kisiTuru.equals("OGRETMEN")){
            if (ogretmenList.isEmpty()){
                System.out.println("liste bos silemezsin");
            }
            for (int i = 0; i < ogretmenList.size(); i++) {
            if (ogretmenList.get(i).getAdSoyad().equals(adSoyad)&&ogretmenList.get(i).getKimlikNo().equals(kimlikNo)){
                System.out.println("girdiginiz "+adSoyad+" listeden silindi"+ogretmenList.remove(i));
            }else {
                System.out.println("girdiginiz "+ adSoyad+ " listede mevcut degil");
            }

            }
        }

    }     private static void listeleme(){
        System.out.println("*** "+kisiTuru+" listeleme sayfasina hosgeldiniz");
        if (kisiTuru.equals("OGRENCİ")){
            System.out.println("Ogrenci listesi :"+ogrenciList);
        }else {
            System.out.println("Ogretmen listesi : "+ogretmenList);
        }

      }
      private static void arama(){
          System.out.println("*** "+kisiTuru+" arama sayfasina hosgeldiniz");
          scan.nextLine();
          System.out.println("isim soyisim gir");
          String adSoyad=scan.nextLine();
          System.out.println("kimlik no girin");
          String kimlikNo=scan.nextLine();

          for (int i = 0; i <ogrenciList.size() ; i++) {
              if (kisiTuru.equals("OGRENCİ")){
           if (ogrenciList.get(i).getKimlikNo().equals(kimlikNo)){
               System.out.println("Aradigin ogrenci mevcut");
           } else {
               System.out.println("ogrenci bulunamadi ekleme yapmak icin devam edin");
           }
              }

          }
          for (int i = 0; i <ogretmenList.size() ; i++) {
              if (kisiTuru.equals("OGRETMEN")){
          if (ogretmenList.get(i).getKimlikNo().equals(kimlikNo)){
              System.out.println("Aradigin ogretmen mevcut");
              }else {
              System.out.println("ogretmen bulunamadi ekleme yapmak icin devam edin");
          }
              }

          }
      }

    private static void islemMenusu() {
        System.out.println("sectigin kisi turu :" + kisiTuru + " lutfen assagidaki islemi secin");
        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ");

        System.out.println("islem tercihinizi giriniz :");
        int secilenİslem = scan.nextInt();




            switch (secilenİslem) {
                case 1:
                    ekle();
                    islemMenusu();
                    break;

                case 2:arama();
                    islemMenusu();
                    break;

                case 3:listeleme();
                    islemMenusu();
                    break;

                case 4:silme();
                    islemMenusu();
                    break;

                case 5:
                    girisPaneli();
                    break;
                case 0: cikis();
                    break;
                default:
                    System.out.println("gecerli bir menu girin");
                    islemMenusu();
                    break;

            }


        }





    private static void ekle() {
        System.out.println("****"+kisiTuru+" ekleme sayfasina hosgeldiniz");
        System.out.println("isim soyisim girin");
        scan.nextLine();
        String adSoyad=scan.nextLine();


        System.out.println("kimlik girin");
        String kimlikNo=scan.nextLine();

        System.out.println("yasinizi girin");
        int yas=scan.nextInt();

        if (kisiTuru.equals("OGRENCİ")){

          scan.nextLine();
            System.out.println("ögrenci no girin");
            String ogrenciNo=scan.nextLine();

            System.out.println("sinifini gir");
           String sinif=scan.nextLine();

           Ogrenci ogrenci=new Ogrenci(adSoyad,kimlikNo,yas,ogrenciNo,sinif);
           ogrenciList.add(ogrenci);


        }else {

            System.out.println("bolum giriniz");
            String bolum=scan.nextLine();

           scan.nextLine();

            System.out.println("sicil no girin");
            String sicilNo=scan.nextLine();

            Ogretmen ogretmen=new Ogretmen( adSoyad,kimlikNo,yas,bolum,sicilNo);

            ogretmenList.add(ogretmen);
        }

    }
    }