package day13_methodCreation;

public class C06_mthodCreationReturn {
    public static void main(String[] args) {


        int sayi1=10;
        int sayi2=5;

        int toplama= toplam(sayi1,sayi2);


    }

    private static int toplam(int sayi1, int sayi2) {

        System.out.println(sayi1+sayi2);

        return sayi1+sayi2;
    }


}
