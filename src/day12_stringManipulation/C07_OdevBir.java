package day12_stringManipulation;

public class C07_OdevBir {
    public static void main(String[] args) {


        //" Java ogrenmek123 Cok guzel@ " Stringi "Java ogrenmek cok guzel." sekline getirin

        String str= "Java ogrenmek123 Cok guzel@ ";
         str= str.replaceAll("\\d", "" )
                 .replaceAll(" ","qwqwq").
                 replaceAll("\\W", "").
                 replace('C', 'c' ).
                 replaceAll("qwqwq" ," ").trim();
        System.out.println(str);



    }
}
