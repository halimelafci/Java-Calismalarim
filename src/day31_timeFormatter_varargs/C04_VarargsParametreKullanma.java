package day31_timeFormatter_varargs;

public class C04_VarargsParametreKullanma {
    public static void main(String[] args) {
        enUzunKelimeyiYazma(5, "Ali", "Ayse", "Veli", "Burak", "Halime");

        //varargs parametresinde iki farkli data türü olabilir ama varargs sonda olmalidir
    }

    private static void enUzunKelimeyiYazma( int kelimeSayisi, String... isimler) {

        String enUzunKelime = isimler[0];
        for (String each:isimler ) {

            if(each.length()>enUzunKelime.length())

                enUzunKelime=each;


        }
        System.out.println("kelimeSayisi :"+kelimeSayisi+" enUzunKelime : "+enUzunKelime);


    }
}
