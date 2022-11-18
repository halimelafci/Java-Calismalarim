package day10_stringManipulation;

public class C05_lenght {
    public static void main(String[] args) {
       // length () metodu bize int dönderir
        // stringdeki toplam karakter sayısını ögreniriz
        String str="Java ogren isi kap";
        System.out.println(str.length()); //toplam uzunluk 18
        System.out.println(str.length()-1); // 17 verir
        // index saymaya 0 dan basladıgı icin uzunlugun (length) bi eksigini verir
        System.out.println( str.charAt(str.length()-5));  // i harfini verir.
    }
}
