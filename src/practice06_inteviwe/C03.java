package practice06_inteviwe;

import java.util.Scanner;

public class C03 {

      // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
      //bunu kart sifre kontrol de de kullabilirinisz

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String sifre="erdal.bey123";
        int girisSayisi=3;



        while (true){
            System.out.println("sifre gir");
            String girilenSifre=scan.nextLine();

            if (sifre.equals(girilenSifre)){
                System.out.println("sifre basarili");
                break;
            }else System.out.println("yanlis sifre girdiniz");
            girisSayisi--;
            System.out.println("kalan giris hakkin :"+girisSayisi);

        if (girisSayisi==0){
            System.out.println("giris hakkin bitti kart bloke oldu "+girisSayisi);
            break;
        }}

    }
}
