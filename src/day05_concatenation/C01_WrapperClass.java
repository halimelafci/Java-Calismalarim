package day05_concatenation;

public class C01_WrapperClass {
    public static void main(String[] args) {

       // Wrapper class javanin hazir methodlari kullanabilmemiz icin
        // primitive data turlerinin herbiri icin actigi class'lardir
       // int --> Integer
      //  char --> Character
     // digerleri primitive data turu ile ayni sadece bas harfi buyuk yazılır.

        System.out.println(Byte.MIN_VALUE); //bu hazır metod sayesinde byte nin en az kac sayı oldugunu öğreniriz.
        System.out.println(Byte.MAX_VALUE); // Burda ise en cok kac oldugunu öğreniriz

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

         String str= "55443322";
         Integer sayi=Integer.parseInt(str);
         System.out.println(str+4);  // burdaki işlemde metinsel ifade oldugu için +4 yanına yazıldı toplama işlemi olmadı.
        System.out.println(sayi+5); //bu işlemde ise string inn te çevrildiği için toplama işlemi yapıldı.





    }
}
