package day11_strinMnipulation;

public class C04_endsWith {
    public static void main(String[] args) {

    String str = "ah be java";
        System.out.println(str.endsWith("Java")); //true ne ile bittigini sorar boolean döndürür
        System.out.println(str.endsWith("ava"));//true  bitişi kelime,harf,hece farketmez
        System.out.println(str.endsWith("")); //true hiçlik ile bittigi için yine true dolur

    }
}
