package day41_abstracctClass_interfaces;

import java.util.ArrayList;
import java.util.List;

public class ConcriteChilde extends Abstract {

    public static void main(String[] args) {

      //  List<String> obje1=new List<String>(); list abstract oldugundan obje olusturamazsin
     // ArrayList ile yaparsan obje üretebiliriz


    }
    @Override
    public void cikarma() {



    }

    @Override
    public void mod() {
        //ilk concrite class butun methodlari overide yaptıgı iciin bundan sonraki concrit class
        // override yapmak zorunda degil
    }




    /*
    concrite class estends oldugu calssin butun abstcact methotlarini overriding yapmak zorunda
    burda oldugu gibi cikarma methodu abstract oldugundan mecbur aldi ama toplama methodunu almak zoruda degil

    acsess modifer parentla ya ayni yada daha genis olamali aksi halde hata verir

     */
}
