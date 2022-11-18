package day06_andOparatorleri;

public class C01_AndOperatorleri {
    public static void main(String[] args) {

        /*
        Java and operatoru konusunda bize iki secenek sunar
        && kullanirsak, ilk false buldugunda, artik sonucun false olacagini bilir
        ve geriye kalan sartlari incelemez
        & kullanirsak tum sartlari kontrol eder sonra sonucu belirler
        bu calisma usulunden dolayi & operatoru, && operatorune gore daha yavas olabilir.
         */

        int sayi=12;
        int sayi1=15;
        int sayi2=20;

        System.out.println(sayi< sayi2 && sayi2>sayi1); //her ikisi de doğru olduğundan sonuç true olur.

        System.out.println(sayi>sayi1 && sayi2>sayi1); // ilk seçenek yanlış oldugundan cevap false olur.

      //tek & and kullanılınca ilki yanliş olsa bile diğer secenekleri de kontrol eder ondan sonra yazdırır.
        // diğerine göre daha yavaş çalısır.

        System.out.println(sayi>sayi1 & sayi2>sayi1); //false
    }
}
