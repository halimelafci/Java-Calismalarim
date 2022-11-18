package day10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {
      // indexOf() metodu bize int dönderir
        String str="java ogrenmek cok mu guzel";
        System.out.println(str.indexOf('g')); // 6 g harfinin indexini buldu
        System.out.println(str.indexOf('t')); // olmayan bir karakter istendiginde java olamadıgını belirtmek icin
        // -1 ile ifade eder.
         if (str.indexOf('k')==-1){
             System.out.println( "k harfi yok");}
         else {
             System.out.println("k harfi var");
         }


    }
}
