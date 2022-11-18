package day20_Arrays2;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {

        //binary search java da eleman aramanin kisa yoludur
        // ancak dogru sonuc almak icin once siralama yapmal lazim
        //yoksa sonucu bulamayabilir yada yanlis bulabilir.
        String[] harfler={"c","b","y","z","a"};
        String arananHarf="a";
        System.out.println(Arrays.binarySearch(harfler,arananHarf)); // -1
        // a harfi strig de oldugu halde bulamadi cunku sort yani siralama yapmadik banari de ortadan bakiyor
        //a harfi sol tarafta olmasi gerektigi icin sola bakıyor bulamayinca da olmadigini ve eger olsaydi kacinci
        //sirada oalbilecegini soyluyor. eger a harfi olasydı 1 de olurdu diyor olamayisini ise - ile ifade ediyo.
        String arananHarf2="c";
        System.out.println(Arrays.binarySearch(harfler,arananHarf2));// 0
        //aradigi harfi buldugunda index olarak verir bulamadıgında sirasini verir


    }
}
