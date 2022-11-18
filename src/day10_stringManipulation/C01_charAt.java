package day10_stringManipulation;

public class C01_charAt {
    public static void main(String[] args) {


        String str="Java ögrenmek ne güzel";
        System.out.println(str.charAt(0)); // J
        System.out.println(str.toUpperCase().charAt(10)); //M
        System.out.println(str.charAt(2)); //v



        // System.out.println(str.charAt(22)); // StringIndexOutOfBoundsException
        // son harfi bulmak icin str'in uzunlugunun 1 eksigini index olarak gireriz
        // eger index olarak uzunlugu veya daha bir sayiyi girersek Java exception verir
        // charAt() kullandigimizda sonuc char olacagi icin artik manipulation yapamayiz
        // String method'larindan kullanmamiz gereken bir method varsa
        // charAt( ) 'den once kullanmaliyiz. Bu metod bize karakter dönderir
    }
}
