package day35_InheritancedeConstructurKullanimi;

public class Personel {

    String isim="ali";

    static String isim1="gül";

    Personel(){
        System.out.println("personel parametresiz calisti");
    }

    Personel (String isim){
        System.out.println("personel parametreli calisti");
    }
}
