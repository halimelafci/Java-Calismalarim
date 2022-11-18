package practice05.okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_Giris {


    /*
     ogretmen bilgilerini kullanicidan aliniz
     aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */
    /*
     ogretmen bilgilerini kullanicidan aliniz
     aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */
    public static Scanner scan=new Scanner(System.in);
    //Scanneri ststsk yazdik ve mainin disina yazdik cunku

    public static <OgretmenBilgileri> void main(String[] args) {

        System.out.println("hosgeldiniz okulumuza ");
        System.out.println("isminizi girin ");



        String isim=scan.nextLine();

        System.out.println("soyisminizi girin ");
        String soyisim=scan.nextLine();

        System.out.println("yasinizi girin ");
        int yas=scan.nextInt();
        scan.nextLine(); //dummy hayalet komut

        System.out.println("bransinizi giriniz ");
        String brans=scan.nextLine();

        System.out.println("telefon numaranizi girin ");
        String telno=scan.nextLine();

        C02_OgretmenBilgileri adayOgretmen=new C02_OgretmenBilgileri(isim,soyisim,yas,brans,telno);

        List<C02_OgretmenBilgileri>ogretmenList=new ArrayList<>();
        ogretmenList.add(adayOgretmen);

        System.out.println("ogretmenlist : "+ ogretmenList);


}
}
