package day34_inheritance;

public class Personel {

   protected int persNo;
   protected String isim="isim belirtilmedi";
   protected String depertman="depertman belirtilmedi";

   //protected olunca aynı pakereti classlae ve aynı classin child
    // Ve baska paketteki child'lar ulasirlar

    public void maas(){
        System.out.println("tum personelin maasi bellidir");
    }

    public void mesai(){
        System.out.println("tum personel statusune gore mesai yapar ");
    }
    public void fazlaMesaiUcreti(){
        System.out.println("personel fazla mesai ucretini statusune gore alir");
    }
}
