package day13_methodCreation;

public class C04_methodCreationReturn {
    public static void main(String[] args) {

     // bu olusturdugumuz metodun void den farkı bize geri dönüsüm yapmasıdır.

        String isim = "berk";
        String soyisim= "karanfil";

        // isimGizleme(isim,soyisim);
       String str= isimGizleme2(isim,soyisim);

        System.out.println( str );

    }

     private static String isimGizleme2(String isim, String soyisim) {


        String yenisim =  isim.substring(0,1).toUpperCase();
        String kalanisim = isim.substring(1).replaceAll("\\w","*");
        String yeniSoyisim = soyisim.substring(0,1).toUpperCase();
        String kalanSoyisim= soyisim.substring(1).replaceAll("\\w","*");

      return  yenisim+kalanisim +"  " + yeniSoyisim + kalanSoyisim;

     }
}