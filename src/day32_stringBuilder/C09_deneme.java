package day32_stringBuilder;

import java.util.Locale;

public class C09_deneme {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("java cok guzel");
        //stringdeki bir methodu StringBuldirde kullanmak istersek önce onu toString methodu ile normal stringe ceviririz
        //daha sonra methodu kullanırız

        String cevirme=sb.toString().toUpperCase();

        System.out.println(cevirme); //JAVA COK GUZEL

        StringBuilder sb1=new StringBuilder(cevirme);

        System.out.println(sb1);// //JAVA COK GUZEL

    }
}
