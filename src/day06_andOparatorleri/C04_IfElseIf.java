package day06_andOparatorleri;

public class C04_IfElseIf {
    public static void main(String[] args) {
      // ikiden fazla şart cümlesi olursa else if kullanılır.
        int yas=15;
        if (yas<0){
            System.out.println("lütfen tekrar girin");
        }
        else if (yas<18){
            System.out.println("cocuk");
        }
        else if (yas<50) {
            System.out.println("yetiskin");
        }
        else {
        System.out.println( "yaslı");}
        }
    }

