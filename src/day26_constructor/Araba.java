package day26_constructor;

public class Araba {

    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Araba(String marka, String model, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    public Araba() {
    //burdaki bos consturactr bi sonraki class daki parametresiz objenin calsabilmesi icin gerekli.
    }
}
