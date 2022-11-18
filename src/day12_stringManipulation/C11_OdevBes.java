package day12_stringManipulation;

import java.util.Scanner;

public class C11_OdevBes {
    public static void main(String[] args) {

        //kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("dört harfli bir kelime girin");
        String kelime= scan.next();
        System.out.println(kelime.substring(3)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1));



    }
}
