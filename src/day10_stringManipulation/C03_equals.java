package day10_stringManipulation;

public class C03_equals {
    public static void main(String[] args) {
         /*
         String'lerde ayni String olsa bile == herzaman calismaz
         emin olmak isterseniz equals() kullanmalisiniz
         equals() kullandigimizda dikkat edecegimiz TEK SEY Metinlerin bire-bir ayni olmasidir
          bu metod bize boolean dönderir
         */


        String str1= "Ali Can";
        String str2= "Ali CAN";
        String str3= "Ali Can" + "";
        String str4= "Ali Can";
        String str5= new String("Ali Can");


        System.out.println(str2.equals(str3));//false
        System.out.println(str3.equals(str5));//true
        System.out.println(str1.equals(str4)); //true



    }



}
