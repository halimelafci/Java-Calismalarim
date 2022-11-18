package day49_lambda_functional_programming01;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class C04 {

    public static void main(String[] args) {

        System.out.println(yediden100eKadarSayilarinToplami());
        System.out.println(ikidenOnbireKadarSayilarinCarpimi());
        System.out.println(get5Faktoryel(5));
        System.out.println(verilenİkiSayiArasindakiCiftSayilarinToplami(6,2));
        System.out.println(ikiSayiArasindakiTümSayilarinRakamlarToplami(23,32));


    }

    //1) 7'den 100'e kadar integer değerlerinin toplamını bulan bir method oluşturun.

    public static int yediden100eKadarSayilarinToplami(){
       //1.yol
        //return IntStream.rangeClosed(7,100).sum();

        //2. yol
        return IntStream.rangeClosed(7,100).reduce(Math::addExact).getAsInt();
    }
    // 2) 2'den 11'e kadar integer degerlerinin carpimini bulan bir method yazin
    public static int ikidenOnbireKadarSayilarinCarpimi(){
        return IntStream.rangeClosed(2,11).reduce(Math::multiplyExact).getAsInt();
    }
    // 3) verilen bir sayininfaktöryelini hesaplayan method olusturun

    public static  int get5Faktoryel(int x){
        return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
    }
    // 4) verilen iki sayi arasindaki cift sayilarin toplamini bulan bir methot olusturun

    public static int verilenİkiSayiArasindakiCiftSayilarinToplami(int x ,int y){
        int z=0;
        if(x>y)
         z=x;
         x=y;
         y=z;

       return IntStream.rangeClosed(x,y).filter(Utils::ciftElemanSec).reduce(Math::addExact).getAsInt();

    }

    // 5) verilen iki sayi arasindaki tüm sayilarin rakamlar toplamini hesaplayan bir method olusturun

    public static int  ikiSayiArasindakiTümSayilarinRakamlarToplami(int x,int y){

        int z=0;
        if(x>y)
            z=x;
        x=y;
        y=z;

        return IntStream.rangeClosed(x,y).map(Utils::rakamlarToplami).sum();
    }

}
