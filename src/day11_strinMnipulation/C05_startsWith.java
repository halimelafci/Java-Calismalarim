package day11_strinMnipulation;

public class C05_startsWith {
    public static void main(String[] args) {

       String str="java cok zor degil mi";
        System.out.println(str.startsWith("J")); //false
        System.out.println(str.startsWith("java" )); //true
        System.out.println(str.startsWith("zor",9)); // 9. index zor kelimesi ile mi baslıyor true

       // "....." ilemi baslıyor diye sorar sonuc olarak da boolean döner

    }
}
