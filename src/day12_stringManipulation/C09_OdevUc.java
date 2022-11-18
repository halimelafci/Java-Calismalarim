package day12_stringManipulation;

import java.util.Scanner;

public class C09_OdevUc {
    public static void main(String[] args) {

        //kullanicidan isim isteyin.Eger
        //isim "a" harfi iceriyorsa "Girdiginiz isim a harfi iceriyor"
        //isim "Z"harfi iceriyorsa "Girdiginiz isim Z harfi iceriyor"
        //ikisi de yoksa "Girdiginiz isim a veya Z harfi icermiyor" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen isminizi girin");
        String str= scanner.nextLine();
         if(str.toLowerCase().contains("a") && str.toUpperCase()
                 .contains("Z") ){
             System.out.println("girdiginiz isim a ve Z harfi iceriyor");
         }
          else if (str.toLowerCase().contains("a")){
            System.out.println("girdiginiz isim a harfi iceriyor");
        } else if ( str.toUpperCase().contains("Z")){
            System.out.println("girdiginiz isim Z harfi iceriyor");
        }else {
            System.out.println("girdiginiz isim a veya Z harfi icermiyor");
        }








    }
}
