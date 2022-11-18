package day03_DataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {

        //autowidening de data cast yapmaya gerek yoktur,kendisi otomatik genişletecektir

        byte sayi1=4;
        short sayi2=sayi1;
        int sayi3=sayi2;
        System.out.println(sayi3);

        //explicit narrowing de ise daha dar bir veri tipine geçmek istediğimizde java dönüşümü OTOMATİK yapmayacaktır
        double sayi4=4566.38;
        int sayi5=(int) sayi4;
        short sayi6=(short)sayi5;
        System.out.println(sayi5);
    }
}
