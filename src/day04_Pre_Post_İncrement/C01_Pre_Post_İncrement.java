package day04_Pre_Post_İncrement;

public class C01_Pre_Post_İncrement {
    public static void main(String[] args) {

    //değer atama işleminde pre yani ++sayi şeklinde olduğunda önce sayı arttırılır sonra atama yapılır

        int sayi=15;
        int sayi1=++sayi;
        System.out.println( "pre incrementden sonra:"+ sayi1);

        // deger atama işlemşnde post yani sayi++ şeklinde olduğunda önce atama yapar sonra arttırır.

        int sayi2=10;
        int sayi3= sayi2++;
        System.out.println("post incrementen sonra: " + sayi3);





    }
}
