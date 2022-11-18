package day31_timeFormatter_varargs;

public class C02_VarargsStringYapma {
    public static void main(String[] args) {
        // en uzun kelimeyi yazdir methodu olusturun


        enUzunKelimeyiYazma("Ali", "Ayse", "Veli", "Burak", "Halime");
    }

    private static void enUzunKelimeyiYazma(String... isimler) {

        String enUzunKelime = isimler[0];
        for (String each:isimler ) {

            if(each.length()>enUzunKelime.length())

           enUzunKelime=each;


        }
        System.out.println("enUzunKelime : "+enUzunKelime);
    }


}
