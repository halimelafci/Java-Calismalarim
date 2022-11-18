package day36_inheritancedeDataTypeKullanimi;

public class Dİsci extends BMuhasebe {

    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;

    protected void maas() {
        System.out.println("personel min :" + (30 * gunlukMesai * saatUcreti) + " maas alir");
    }

    protected void ozelSigorta() {
        System.out.println("isteyen calisanlara %70 indirimli ozel sigorta yapilir");
    }
    /*
    obje leri aramaya BMuhasebe classina bakarak baslar bulunca alir
    1-obje kendi classinda varsa ordan alır ama yoksa parent classdan alir orda yoksa cte verir
    2-obje method olursa kendi classda varsa orda alir yoksa ust classdan alir (ust classda yoksa cte verir)
    sonra merhod sayet cons olan clasda varsa (Dİsci) OVERRADİNG olur ve son degeri cons.daki olur
     */



    public static void main(String[] args) {

     //Class BMuhasebe ama cons.Dİsci olusturduk.
       BMuhasebe isci1 = new Dİsci();

        System.out.println(isci1.isim);//isim belirtilmedi --> APersenolden aldı kendinde ve parentinde yok
        System.out.println(isci1.soyisim);//soyisim belirtilmedi --> APersonelden aldi
        System.out.println(isci1.depertman);//depertman belirtilmedi --> APersonelden aldi
        System.out.println(isci1.gunlukMesai);//8 --> BMuhasebeden aldi
        System.out.println(isci1.saatUcreti);//10 --> BMuhasebeden aldi
        isci1.maas();   //personel min :2310 maas alir
        isci1.ozelSigorta(); //isteyen calisanlara %70 indirimli ozel sigorta yapilir
        isci1.sigorta();  //tum personelimize sigorta yapilir  -->Apersonelden aldı

    }
}
