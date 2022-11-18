package day28_statickBlock;

public class C03_PasByValue {
    public static void main(String[] args) {

        double satisFiyati=100;
        double indirimliFiyat=indirimliFiyatHesapla(satisFiyati);
        System.out.println("indirimliFiyat"+indirimliFiyat);
        System.out.println("indirimliFiyat"+indirimliFiyat);
        System.out.println("indirimliFiyat"+indirimliFiyat);
        System.out.println("indirimliFiyat"+indirimliFiyat);
        //ne kadar indirim yapilirsa yapilsin ilk deger 100 oldugu ve java Pas By Value oldugu icin
        // ilk fiyat degismez inirim herseferinde satisfiyati uzerinden yapilir
    }

    private static double indirimliFiyatHesapla(double satisFiyati) {

        double indirimliFiyat=satisFiyati*0.75;


        return indirimliFiyat;
    }
}
