package day10_stringManipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {
        String str="java cok zor";
        System.out.println(str.toUpperCase()); //hepsini büyük yazar
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr"))); //dil secenegi var
        System.out.println(str.toLowerCase());  //hesini kücük yazar

    }
}
