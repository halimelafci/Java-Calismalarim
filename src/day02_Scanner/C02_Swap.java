package day02_Scanner;

public class C02_Swap {
    public static void main(String[] args) {

        // iki degerin yerini degiştirme
        int sayi1=5;
        int sayi2=10;
        // iki sayının yerinini degiştirmek için 3. bir deger atanır.
        int sayi3=0;

        sayi3= sayi2;
        sayi2=sayi1;
        sayi1=sayi3;
        System.out.println("swaptan sonra sayi1:"+sayi1 +" " +"swaptan sonra sayi2:"+ " " +sayi2);

    }
}
