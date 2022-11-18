package day01_Variables;

public class C01_Variables {
    public static void main(String[] args) {
        System.out.println("hello java");
        //isim ve soyisim icin iki variable olusturun ve bunlari yazdırın.

        String isim= "halime";
        String soyisim="lafcı";

        System.out.println("isim:" +isim);
        System.out.println("soyisim:"+ soyisim);

       //Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
        int sayı1= 10;
        short sayı2=5;
        System.out.println("iki sayının toplam:" +(sayı1+sayı2));

     //Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
        short sayı3=8;
        double sayı4=5.2;
        System.out.println( "sayı3 ve sayı4 toplamı:" + (sayı3+sayı4));
     //char data turunde bir variable olusturun ve yazdirin
        char harf='A';
        System.out.println(harf);

        //Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.

        int tamsayı=10;
        char degişken='&';
        System.out.println(tamsayı+degişken);

        
    }
}
