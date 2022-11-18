package day36_inheritancedeDataTypeKullanimi;

public class APersonel {
    String isim="isim belirtilmedi";
    String soyisim="soyisim belirtilmedi";
    String depertman="depertman belirtilmedi";


    protected void maas(){
        System.out.println("tum personelimiz maas alir");
    }


    protected void sigorta(){
        System.out.println("tum personelimize sigorta yapilir");
    }
}
