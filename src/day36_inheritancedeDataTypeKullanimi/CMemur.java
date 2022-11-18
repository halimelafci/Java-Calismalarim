package day36_inheritancedeDataTypeKullanimi;

public class CMemur extends BMuhasebe {

    protected int saatUcreti=12;
    protected int gunlukMesai=9;

    protected void maas(){
        System.out.println("memurlar :"+(30*saatUcreti*gunlukMesai+" maas alir"));

    }
    protected void ozelSigorta(){
        System.out.println("memurlar %60 indirim ile ozel sigorta yapilir");
    }

    public static void main(String[] args) {

        CMemur mmr1=new CMemur();

        System.out.println(mmr1.isim);//isim belirtilmedi --> APersenolden aldı kendinde ve parentinde yok
        System.out.println(mmr1.soyisim);//soyisim belirtilmedi --> APersonelden aldi
        System.out.println(mmr1.depertman);//depertman belirtilmedi --> APersonelden aldi
        System.out.println(mmr1.gunlukMesai);//9
        System.out.println(mmr1.saatUcreti);//12
        mmr1.maas();  //memurlar :3240 maas alir
        mmr1.ozelSigorta();//isteyen calisanlara %60 indirimli ozel sigorta yapilir
        mmr1.sigorta();//tum personelimize sigorta yapilir  -->Apersonelden aldı
        System.out.println();

        BMuhasebe mhsb1 =new BMuhasebe();

        System.out.println(mhsb1.isim);//isim belirtilmedi --> APersenolden aldı kendinde ve parentinde yok
        System.out.println(mhsb1.soyisim);//soyisim belirtilmedi --> APersonelden aldi
        System.out.println(mhsb1.depertman);//depertman belirtilmedi --> APersonelden aldi
        System.out.println(mhsb1.gunlukMesai);//8
        System.out.println(mhsb1.saatUcreti);//10
        mhsb1.maas(); //personel min :2400 maas alir
        mhsb1.ozelSigorta();//isteyen calisanlara %50 indirimli ozel sigorta yapilir
        mhsb1.sigorta(); //tum personelimize sigorta yapilir  -->Apersonelden aldı




    }
}
