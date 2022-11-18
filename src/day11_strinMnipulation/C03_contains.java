package day11_strinMnipulation;

public class C03_contains {
    public static void main(String[] args) {

        // cümle icinde istenilen kelime var mı yok mu diye cevap verir
        // contains metodu bize boolean döner.
        // sadece string alır char almaz

       String cümle="ali ata bak";
       String kelime= "bak";

        System.out.println(cümle.contains(kelime)); //cumlede kelime var mı true
        System.out.println(!cümle.contains(kelime)); //cümlede kelime yok degil mi? false



    }
}
