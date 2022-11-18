package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb=new Araba("honda");
        System.out.println(arb.marka); //honda

        //arabanin model ve yakiti private oldugu icin direkt cagrilmaz
        //ancak get ve set metodlari ile cagrilir
        arb.setModel("civic");
        //set methodunda sadece ekleme yapilir yazdirma olmaz
        arb.getModel();//bunda ise sautta yazdirir göruruz degisim olmaz
        System.out.println(arb.getModel()); //civic
        System.out.println(arb.getYakit());//elektrikli bunda degisim olmaz ilk atanan ne ise o cıkar
        // degistirmek istersek  arb.setYakit methodu ile degisir

    }
}
