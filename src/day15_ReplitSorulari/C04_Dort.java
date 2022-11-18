package day15_ReplitSorulari;

import java.util.Scanner;

public class C04_Dort {
    public static void main(String[] args) {
        /*
        Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
         Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.

         1 şeker = 1.7 gr
        Örnek Çıktı:
        Yılda 12.41 kg şeker kullanıyor.

        */
        Scanner scan =new Scanner(System.in);
        System.out.println("bir gunde kac bardak cay iciyorsunuz");
        int cay=scan.nextInt();
        System.out.println("bir gunde ne kadar seker kullanıyorsunuz (1 seker 1.7 gr dir)");
        double seker=scan.nextDouble();
        double gun=cay*seker;
        double sekergr=1.7;
        double birGunSekeri=gun*sekergr;
        System.out.println( "bir gunde kullanılan seker :"+ birGunSekeri);
        double yıldaKullanilanSeker=(birGunSekeri*365)/1000;
        System.out.println("Yilda "+yıldaKullanilanSeker+" kg şeker kullanıyor.");


    }
}
