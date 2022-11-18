package day37_overridding;

public class CSupra extends BToyota {

    @Override  //void yazinca ot
    void marka() {
        System.out.println("supra model");
    }

    public static void main(String[] args) {
       CSupra arb=new CSupra();
       arb.marka();//overriding yapti //supra model


      Araba arb1=new CSupra();
      arb1.yakit();
        //yakiti benzinlidir  aramaya yukardan bakti ve kendine kadar gelemedi
        // cunku kendinde yok en son guncel nerede varsa onu aldı toyoya classindan aldi

        arb1.marka(); //supra modelson gunceli aldi
    }
}
