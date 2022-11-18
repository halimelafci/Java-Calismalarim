package day39_exceptions;

public class C03_Exception {
    public static void main(String[] args) {

        /*
       1-Exception: parent Exception olur dirleri onun childi
       2-NumberFormatException= rakam formatinda ama hata veren biey var (Run time Exception)
           yani sayilarin arasiana giren harf gibi
       3- FileNotFoundException= dosya bulunamadi hatasi (compile time Exception)
       4- AritmetikException=bir sayiyi 0 a bolmede verir
       5-NullpointerException=null atanmıs bir veraiblede length yada subStrig de verir(Run time Exception)
       6-ArrayIndexOfException arrayin uzunlugu disinda bir index girilince verir(Run time Exception)
       7-ClassCastException=cast yapilamayacak bir dataya ceviirnce cikar (Run time Exception)
       8-İllegalArgumentException=yas istendiginde -30 gibi girerse Exception biz firlatiriz
         */

        String str="132hg4";

        int sayi= 0;
        try {
            sayi = Integer.parseInt(str);

        } catch (NumberFormatException e) {
            System.out.println("sayi harf iceriyor");
        }
        catch(Exception e){

            System.out.println("sayinin karesi "+sayi*sayi);
        }}


    }

