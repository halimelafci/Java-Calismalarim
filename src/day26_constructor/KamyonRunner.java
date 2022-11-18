package day26_constructor;

public class KamyonRunner {
    public static void main(String[] args) {
        Kamyon kamyon1=new Kamyon();

        System.out.println("kamyon 1 bilgileri\n"+ kamyon1);

        Kamyon kamyon2=new Kamyon("Mercedes","1040",2010,5550);

        System.out.println("kamyon2 bilgileri :" +kamyon2);
      //toString methodu ile soutta tek tek yazmaya gerek kalmadi cunku atamasi kamyon methodunda yapildi

    }
}
