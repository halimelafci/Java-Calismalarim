package day15_ReplitSorulari;

import java.util.Scanner;

public class C03_Uc {
    public static void main(String[] args) {
        //Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.
        //
        //Ornek Cikti :
        //
        //Alan: 9
        //
        //Cevre: 12

        Scanner scan =new Scanner(System.in);
        System.out.println("karenin kenar uzunlugunu girin");
        int kareninUzunlugu=scan.nextInt();
        int kareninCevresi=kareninUzunlugu*4;
        System.out.println("karenin alani : " +kareninUzunlugu*kareninUzunlugu);
        System.out.println("karenin cevresi : " +kareninCevresi);

    }
}
