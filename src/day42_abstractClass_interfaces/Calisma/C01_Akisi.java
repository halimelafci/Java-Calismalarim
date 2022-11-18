package day42_abstractClass_interfaces.Calisma;

import java.util.Scanner;

public class C01_Akisi implements İseAlim{

    public static void main(String[] args) {

        C01_Akisi kisi=new C01_Akisi();
        kisi.isimSoyisim();
        kisi.kimlikNo();
        kisi.askerlikYaptiMi();
    }
    @Override
    public void isimSoyisim() {
        System.out.println("Ali can");
    }

    @Override
    public void kimlikNo() {
        System.out.println("123456789");

    }

    @Override
    public void tecrube() {

    }

    @Override
    public void referans() {

    }

    @Override
    public void askerlikYaptiMi() {

        Scanner scan =new Scanner(System.in);
        System.out.println("askerlik yaptın mı Evet veya Hayir gir");
        String cevap=scan.next();
        boolean evet=true;
        boolean hayir=false;

        if(cevap.equals("evet")){
            System.out.println("askerlik yaptı");
        }else {
            System.out.println( "askerlik yapmadi");
        }


    }
}
