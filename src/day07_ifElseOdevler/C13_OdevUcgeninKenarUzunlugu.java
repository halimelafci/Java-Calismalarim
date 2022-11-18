package day07_ifElseOdevler;

import java.util.Scanner;

public class C13_OdevUcgeninKenarUzunlugu {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen ücgenin üc kenar uzunlugunu girin");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();
        if (kenar1==kenar2 && kenar1==kenar3&&kenar2==kenar3){
            System.out.println("eskenar ücgen");

        }else {
            System.out.println("eskenar ücgen degil");
        }
    }
}
