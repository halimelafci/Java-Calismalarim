package day12_stringManipulation;

public class C05_substring {
    public static void main(String[] args) {
      // bu metod ile strig icindekı istedigimiz kısmı yazdırırız.yazılan ilk indexi sayar ikincisini saymaz

        String str="hayat cok guzel";
        System.out.println(str.substring(10,13)); //guz yansıtır
        System.out.println(str.substring(2,2)); // "" hiclik yazırır

    }
}
