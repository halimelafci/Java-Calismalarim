package day11_strinMnipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {


       String cumle="Java cok kolay , Java cok guzel";
       String kelime="cok";

        /* verilen kelime icin asagidaki sartlardan uygun olani yazan bir program yaziniz
           - verilen kelime cumlede kullanilmamis
           - verilen kelime cumlede sadece 1 kere kullanilmis
           - verilen kelime cumlede birden fazla kullanilmis
         */

        int ilkİndex=cumle.indexOf(kelime);
        int sonİndex=cumle.lastIndexOf(kelime);

        if(ilkİndex==-1){
            System.out.println("kelime cümlede kullanılmamıstır");}
        else if(ilkİndex==sonİndex){
            System.out.println("kelime cümlede bir defa kullanılmıs");
        }
        else {
            System.out.println("kelime cümlede birden fazla kullanılmıs");
        }



    }
}
