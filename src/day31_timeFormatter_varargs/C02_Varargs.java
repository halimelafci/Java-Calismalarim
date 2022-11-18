package day31_timeFormatter_varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        //verilen iki int toplayip soucu yazdiran bir method olusturun

        int sayi1=58;
        int sayi2=69;
        int sayi3=20;
        int sayi4=10;
        int sayi5=45;

        sayilariTopla(sayi2,sayi1);

        sayilariTopla2(sayi2,sayi5,sayi3,sayi1,sayi4);
        sayilariTopla2(sayi4,sayi5,sayi3);
        sayilariTopla2(sayi2,sayi1,sayi5);
        sayilariTopla2(sayi1,sayi3,sayi1,sayi2);





    }



    private static void sayilariTopla(int sayi, int sayi1) {
        int sayilarinToplami=sayi+sayi1;
        System.out.println("verilen iki sayinin toplami : " +sayilarinToplami);
     //burda olusturdugumuz methodda parametresi kac tane ise ona gore islem yapılır 3.bir sayiyi toplama ekleyemeyiz
     //Ama parametre sayisi sınırsız olmasını istiyorsak  methodun parametre kısmında Varargas olusturursak sınırsız eklenir

    }


     private static void sayilariTopla2(int... sayi) {
        int sayiAdedi=sayi.length;
        int toplam=0;
         for (int each:sayi) {
             toplam+=each;


         }
         System.out.println( sayiAdedi+" sayinin toplami : "+toplam);
         //arrays tabalı -dır varargs



    }
}
