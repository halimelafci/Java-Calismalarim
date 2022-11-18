package day12_stringManipulation;

public class C02_replaceAll {
    public static void main(String[] args) {

        // bu metod ile aynı özellikteki bütün karaktrleri sil veya yer degistr  veya bütün özel karakterleri sil
        // yapabiliriz. "java cok güzel degilmi "ye cevirelim
        String str="Java co*k gu zel deg&il mi";
       // System.out.println(str.replaceAll(" ","" )); // bu skilde yaparsak bütün boslukları da siler
        System.out.println(str.replaceAll( " ", "qwer")
                .replaceAll("\\W","")
                .replaceAll("qwer"," ")
                .replace("gu zel","guzel"));






    }
}
