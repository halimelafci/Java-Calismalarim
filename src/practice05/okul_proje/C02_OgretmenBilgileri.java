package practice05.okul_proje;

public class C02_OgretmenBilgileri {

    String isim;
    String soyisim;
    int yas;
    String brans;
    String telno;

    @Override
    public String toString() {
        return "C02_OgretmenBilgileri{" +
                "\nisim=" + isim +
                "\nsoyisim=" + soyisim +
                "\nyas=" + yas +
                "\nbrans=" + brans +
                "\ntelno=" + telno  ;
    }

    public C02_OgretmenBilgileri(String isim, String soyisim, int yas, String brans, String telno) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.brans = brans;
        this.telno = telno;



    }
}
