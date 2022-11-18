package day35_InheritancedeConstructurKullanimi;

public class Zİsci extends PMuhasebe {

    String isim="can";
    Zİsci (){
        System.out.println("isci parametresiz calisti");
    }
    Zİsci(String isim){
        super(isim);//muhasebe classna ulasabilmek icin super() parametreliye gondermek lazim
        this.isim=isim;
        System.out.println("isci parametreli calisti");
    }

    public static void main(String[] args) {

        Zİsci isci1 =new Zİsci();
        System.out.println(isci1.isim);//veliydi sonra da can almis oldu
        //kendisinde  isim olmadigi icin parentina  gitti ordaki veli ismini aldi


        Zİsci isci2 =new Zİsci("ayse");
        System.out.println(isci2.isim);
        //isci2 ye ayse ismini vermeme ragmen yine can yazdi
        //bunun icin yukarda parametre icindeki ayseyi tanitmam lazim

        Zİsci isci3 =new Zİsci();
        System.out.println(((PMuhasebe )isci2).isim);//VELİ
        //burda sout icerisinde özellikle PMuhasebe classindaki ismi istedigimiz icin onu yazdi

        Zİsci i̇sci4=new Zİsci(isim1);
        System.out.println(isim1);
        //parametreli uzerinden ilk classa gidip isim1 yazdirdi.

    }

}
