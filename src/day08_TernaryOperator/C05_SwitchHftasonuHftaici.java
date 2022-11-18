package day08_TernaryOperator;

import java.util.Scanner;

public class C05_SwitchHftasonuHftaici {
    public static void main(String[] args) {
      /*  Kullanicidan gun ismini alin
        hafta ici veya hafta sonu oldugunu yazdirin
                */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir gün girin");
        String gün=scan.next().toLowerCase();
         switch (gün){
             case "pazartesi":
             case "sali":
             case "carsamba":
             case "persembe":
             case "cuma":
                 System.out.println("haftaici");
                 break;
             case "cumartesi":
             case "pazar":
                 System.out.println("haftasonu");
                     break;
             default:
                 System.out.println("gecerli gun ismi girin");
         }
    }
}
