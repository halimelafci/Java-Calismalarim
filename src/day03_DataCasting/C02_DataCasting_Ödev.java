package day03_DataCasting;

public class C02_DataCasting_Ödev {
    public static void main(String[] args) {

        //byte data türünde veri oluşturun short,int, float,doble, data türünde birer değişken oluşturup
        //adım adım wedining yapın

        byte sayi1=9;
        short sayi2=sayi1;
        int sayi3=sayi2;
        float sayi4=sayi3;
        double sayi5=sayi4;
        System.out.println(sayi5);

        //int veri türünde bir değişken oluşturun ve adım adım narrowing yaptırın.

        int sayi6=456454;
        short sayi7= (short) sayi6;
        byte sayi8=(byte) sayi7;
        System.out.println(sayi8);

        //float data türünde bir veriable oluşturun ve yazdırın.
        float sayi9=76.45f;
        System.out.println(sayi9);

        //doble 255.36 sayısını int a sonrada sonra da oluşturduğunuz int sayıyı byt cevip yazdırın.
        double sayi10=255.36;
        int sayi11= (int)sayi10;
        byte sayi12=(byte) sayi11;
        System.out.println(sayi12);

        // int iki sayıyı birbirinr böldürün ve sayıyı yazdırı.
        int num1=45;
        int num2=12;
        double num3= (double) num1/num2;
        System.out.println(num3);

        //int bir sayıyı double bir sayıya böldürün ve sonucu yazdırın.
        int num4=6564;
        double num5=45.5;
        System.out.println(num4/num5);

        //farklı data tipleri ile işlem yapıp sonucu yazdıralım.

          int a1=654;
          short b1=125;
          byte a2=45;
          double b2=567.5;
          b1= (short) (b2/a2);
          b2=(double) a1/a2;
        System.out.println(b1+","+a1+ ","+ b2);

    }
}
