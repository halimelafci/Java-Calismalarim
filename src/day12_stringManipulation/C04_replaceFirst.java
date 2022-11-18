package day12_stringManipulation;

public class C04_replaceFirst {
    public static void main(String[] args) {

       //bu metod istenilenin ilkini degistirir ilk harf veya ilk kelime
        String str=" Java zor Java zor";
        System.out.println(str.replaceFirst( "Java", "Ders")); // Ders zor Java zor
        System.out.println(str.replaceFirst("zor","kolay")); // Java kolay Java zor



    }
}
