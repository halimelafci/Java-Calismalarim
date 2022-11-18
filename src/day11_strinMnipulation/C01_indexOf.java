package day11_strinMnipulation;

public class C01_indexOf {
    public static void main(String[] args) {

        String str="java ogrenmek cok guzel";

        // yukaridaki str'da 2. ve 3. e'nin indexlerini bulun
        // 2.ci e'yi bulabilmek icin 1.e'nin index'ine ihtiyacim var
        //indexof metodunda , kullanarak sonrasını bulabiliriz bu metod bize int döndürür

        int ilke= str.indexOf('e'); //8. indexte
        System.out.println( ilke);
        int ikincie=str.indexOf('e',ilke+1); //11. indexte
        System.out.println(ikincie);
        int ucuncue=str.indexOf('e',ikincie+1); //21. indexte
        System.out.println(ucuncue);

    }
}
