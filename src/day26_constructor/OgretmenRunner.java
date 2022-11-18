package day26_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {



    Ogretmen ogretmen1 = new Ogretmen();
        System.out.println("ogretmen1 bilgileri"+ ogretmen1);
        //isim =Isim belirtilmedi
        //soyisim =Soyisim belirtilmedi
        //dogumTarihi =Tarih girilmedi
        //brans =Brans belirtilmedi
        //yanBrans =Yan brans belirtilmedi

        Ogretmen ogretmen2=new Ogretmen("halime","lafci","15 03 1990","ilahiyat", "it");
        System.out.println("ogretmen2 bilgileri"+ogretmen2);
        //ogretmen2 bilgileri
        //isim =halime
        //soyisim =lafci
        //dogumTarihi =15 03 1990
        //brans =ilahiyat
        //yanBrans =it

        Ogretmen ogretmen3=new Ogretmen("halime","lafci","ilahiyat");
        System.out.println("ogretmen3 bilgileri : "+ogretmen3);
        //ogretmen3 bilgileri :
        //isim =halime
        //soyisim =lafci
        //dogumTarihi =Tarih girilmedi
        //brans =ilahiyat
        //yanBrans =Yan brans belirtilmedi

        //ogretmen3 objem de 3lü constrctor olusturdugum halde geriye kalan ikiisnin defoult degerini yansitti cunku
        //ben toString methodunu kullandigim icin tamamini soutta görürüm.


}
}
