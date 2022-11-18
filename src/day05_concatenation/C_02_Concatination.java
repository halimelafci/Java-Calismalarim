package day05_concatenation;

public class C_02_Concatination {
    public static void main(String[] args) {

        String str="merhaba dünya";
        String str1="hayat cok güzel";
        int sayi1=52;
        int sayi=9;
        System.out.println(str.toUpperCase()+ " " +(sayi1+sayi));
        //bu metod sayesinde büyük harfler ile yazdı.
        System.out.println(""+ sayi1+sayi+" "+ str.toUpperCase()+" "+str1.toUpperCase());
        // başa hiclik "" işareti ile sayıları toplamadan yanyana yazdırıp diğer metod sayesinde ise
        //büyük harfle yazdırdı.
        System.out.println(str+" "+ str1);
        // burda + işareti ile yanyana yazdırdı klasik olan şekilde.
        System.out.println(str.concat(" ").concat(str1));
        // bu concat metodusayesinde ise + işaretini kullanmadan yanyana yazdırır.

    }
}
