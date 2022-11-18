package day26_constructor;

public class Ogretmen {
    String isim="Isim belirtilmedi";
    String soyisim= "Soyisim belirtilmedi";
    String dogumTarihi="Tarih girilmedi";
    String brans="Brans belirtilmedi";
    String yanBrans="Yan brans belirtilmedi";

    public Ogretmen(String isim, String soyisim, String brans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.brans = brans;
    }

    public Ogretmen() {

    }

    @Override
    public String toString() {
        return
                "\nisim =" + isim +
                "\nsoyisim =" + soyisim +
                "\ndogumTarihi =" + dogumTarihi +
                "\nbrans =" + brans +
                "\nyanBrans =" + yanBrans ;
    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;


    }
}
