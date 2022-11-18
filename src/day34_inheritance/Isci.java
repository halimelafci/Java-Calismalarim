package day34_inheritance;

public class Isci extends Personel {
    // extends Personel yzınca parent clasımız olusur

           int persNo=24364;
    public static void main(String[] args) {


        Isci isci1=new Isci();
        System.out.println(isci1.isim);//isim belirtilmedi
        //bu class da isim diye bir verable olmadıgı ve isim e atama yapılmadigi icin
        // parent class a gider ordaki degeri alir
        //ama kendimiz isim atayali ozaman parent classa gitmez

        isci1.isim="ali Can";
        System.out.println(isci1.isim); //ali Can

        System.out.println(isci1.persNo);//24364 burda class levelda persNo
        // atama yapıldıgı icin burdakini aldi parente gitmedi
          isci1.maas();//"isciler min 15 euro alir"
          isci1.ozelSigirta();//"isteyen iscilere %25 indirimli ozel sigorta yapılır"

    }
            public void maas(){
                System.out.println("isciler min 15 euro alir ");
                //maas methoduna yeni atma yaptik


            }
          public void ozelSigirta(){
              System.out.println("isteyen iscilere %25 indirimli ozel sigorta yapılır");
          }
}
