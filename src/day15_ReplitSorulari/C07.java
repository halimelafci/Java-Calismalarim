package day15_ReplitSorulari;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {

       /* Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)
                IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
       BMI 18,5'in altındaysa zayıfsınız
        BMI 18,5 ile 25 arasında ise kilonuz idealdir
        BMI 25-30 arasındaysa şişmansınız
        BMI 30'dan büyük veya eşitse, obez
        Input:
        Output:
        Agirlik : 71
        Boy : 1,72
        BMI : 23.99945916711736
        Zayifsiniz.

       */

        Scanner scan=new Scanner(System.in);
        System.out.println("kilonuzu girin");
        double kilo=scan.nextDouble();
        System.out.println("metre cinsinden boyunuzu girin");
        double boy=scan.nextDouble();
        double bmi=kilo/(boy*boy);


    }
}
