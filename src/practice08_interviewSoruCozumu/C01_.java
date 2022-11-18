package practice08_interviewSoruCozumu;

import java.util.Scanner;

public class C01_ {

       /*  soru1: Check if the integer is an Armstrong numbers to 4 digit
       numbers(4 digit-> exclusive)

    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri
     toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        method create ediniz
        parametre sayi aldin method
        sayilarin küp toplami contener atanacak
        girilen cont if ile kontrol
        % kullanilir
        basamaktaki sayi bos verable olusur

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
      amstrong sayı olup olmadıgını
      gösteren program yazınız */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi girin");
        int sayi=scan.nextInt();

        armstrong(sayi);


}

    private static void armstrong(int sayi) {
        int sayininKuplerToplami=0;
        int basamaktakiSayi=0;
        int girilenSayi=sayi;
        girilenSayiyaKadarOlanAmstrongSayilar(sayi);

        while (sayi>0){
            basamaktakiSayi=sayi%10;
            sayininKuplerToplami+=(basamaktakiSayi*basamaktakiSayi*basamaktakiSayi);
            sayi=sayi/10;

        }
         if (girilenSayi==sayininKuplerToplami){
             System.out.println("girilen sayiarmstrong sayi "+girilenSayi);
         } else {
             System.out.println("girilen sayi amstrong degildir "+girilenSayi);}
         }

    private static void girilenSayiyaKadarOlanAmstrongSayilar(int sayi) {
        for (int i = 1; i <=sayi ; i++) {
            armstrong(i);

        }
    }
}

