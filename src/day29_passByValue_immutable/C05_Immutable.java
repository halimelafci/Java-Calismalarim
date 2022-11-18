package day29_passByValue_immutable;

public class C05_Immutable {
    public static void main(String[] args) {

        String isim="mine";

        isim=isim.toUpperCase();

        System.out.println(isim);//MİNE

        isim="mevlut";
        System.out.println(isim);//mevlut
        //strin degismez dedik ama atama yapılarak icerigi degistirilir ama referans ayni kalir.
    }
}
