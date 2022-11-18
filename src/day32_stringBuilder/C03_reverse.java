package day32_stringBuilder;

public class C03_reverse {
    public static void main(String[] args) {

        //verilen herhangi bir iputu tersine cevirip bize dönduren bir method olusturun

       String input="hava cok sicak";

       String tersİnput=tersCevir(input);

       System.out.println(tersİnput);//kacis koc avah

        tersCevir(input);
        System.out.println(input);//hava cok sicak
    }

    private static String tersCevir(String input) {

        StringBuilder sb=new StringBuilder(input);
        sb.reverse();
     return sb.toString();
    }
}
