package day21_practice;

public class C02 {
    public static void main(String[] args) {
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.
        System.out.println("for ile");
        for (int i = 0; i <=255 ; i++) {
            char sembol= (char) i;
            System.out.println(i+"->"+sembol);

        }
        System.out.println("wile ile");
        int i=0;
        while (i<=255){
            char karakter= (char) i;
            System.out.println(i+"->"+karakter);
            i++;
        }

    }
}
