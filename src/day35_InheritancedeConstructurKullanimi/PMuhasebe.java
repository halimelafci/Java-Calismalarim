package day35_InheritancedeConstructurKullanimi;

public class PMuhasebe extends Personel {

       String isim="veli";

    PMuhasebe(){
        System.out.println("muhasebe parametresiz calisti");
    }
    PMuhasebe (String isim){
        super(isim);

        System.out.println("muhasebe parametreli calisti");
    }
}
