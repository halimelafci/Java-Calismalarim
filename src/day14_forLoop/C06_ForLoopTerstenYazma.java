package day14_forLoop;

public class C06_ForLoopTerstenYazma {
    public static void main(String[] args) {

        // input olarak verilen Stringi terse cevirip yazdiran bir method olusturun

        String str = "ey edip adanada pide ye";
        terseCevir(str);
    }

    private static void terseCevir(String str) {

        String tersi = str.substring(str.length() - 1);

        for (int i = str.length() - 2; i >= 0; i--) {
            tersi += str.substring(i, i + 1);


        }
        System.out.println(tersi);
    }
}
