package day10_stringManipulation;

public class C04_equalsIgnoreCase {
    public static void main(String[] args) {
     // equalsIgnoreCase() bize boolean dönderir
        String str1= "Ali Can";
        String str2= "ali can";
        String str3="ALI CAN";
        String str4= "Ali Can_";
      // equalsIgnoreCase de metnin birebir aynı olamsı yeterli büyük küçük harfe bakmaz

        System.out.println(str3.equalsIgnoreCase(str4) );//false
        System.out.println(str2.equalsIgnoreCase(str3));//true


    }



}
