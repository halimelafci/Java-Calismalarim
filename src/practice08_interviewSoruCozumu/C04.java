package practice08_interviewSoruCozumu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04 {

    /*
        Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
         0-1-1-2-3-5-8-13-21-34....
      */

    public static void main(String[] args) {

        List<Integer>fibonacci=new ArrayList<>();

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi girin");
        int sayi=scan.nextInt();

        fibonacci.add(0);
        fibonacci.add(1);
        System.out.println("fibonacci :"+fibonacci);

        int i=1;
        if (sayi<=1){
            System.out.println("gecerli sayi gir");
        }else {
           while (fibonacci.get(i)<sayi){//fibonacci elemanlari sayidan kucuk olmadigi surece
               fibonacci.add(fibonacci.get(i)+fibonacci.get(i-1));
               i++;
           }

        }
        int sonİnex=fibonacci.size()-1;
        if (fibonacci.get(sonİnex)>sayi){
            fibonacci.remove(sonİnex);
            System.out.println("fibonacci listesi :"+fibonacci);
        }else {
            System.out.println("girdigin sayi fibonacci listesinde var");
        }
    }
}
