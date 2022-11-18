package day28_statickBlock;

public class C02_PasByValue {
    public static void main(String[] args) {
        double satisFiyati=100; //burda degisiklik olursa fiyat degisir sadece

        System.out.println(indirimliFiyat(satisFiyati));

        System.out.println(satisFiyati);
    }
    public static double indirimliFiyat(double orjinalFiyat){
        /*methodumuz %10 indirim yapip
        yeni fiyati main methoda döndursun

        ilk fiyat 100 0ldugundan ikinci kere indirim yapılsa yiine aynı sekilde satis fiyati uzerinden indiirm yapar

         */
     double satisFiyati=orjinalFiyat*0.9; //burdaki satisFiyati yukardaki satisFiyati ile ayni degil scop farkli
        System.out.println(satisFiyati);

        return orjinalFiyat*0.9;
    }
}
