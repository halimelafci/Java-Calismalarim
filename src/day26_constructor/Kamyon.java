package day26_constructor;

public class Kamyon {
    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    int yil;
    int fiyat;

    public Kamyon(String Marka, String Model, int yil, int fiyat) {
    }

    public Kamyon() {
        //kamyonRunner classinin kamyon1 objesi parametresiz
        // bunun icin consturactor olusturmak gerekli
    }

    @Override
    public String toString() {
        return
                "\nmarka=" + marka +
                "\nmodel=" + model +
                "\nyil=" + yil +
               "\nfiyat=" + fiyat ;

    }
}
