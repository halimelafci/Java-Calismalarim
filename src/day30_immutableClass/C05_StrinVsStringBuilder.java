package day30_immutableClass;

import java.time.LocalTime;

public class C05_StrinVsStringBuilder {
    public static void main(String[] args) {


        LocalTime strOnce = LocalTime.now();
        String str = "Ahhhh java";
        LocalTime strSonra = null;

        for (int i = 0; i < 10000; i++) {
            str += ".";
        }
            strSonra = LocalTime.now();
        System.out.println("str: "+(strSonra.getNano()-strOnce.getNano()));





         strOnce = LocalTime.now();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 10000; i++) {
          sb.append(".");
        }
        strSonra= LocalTime.now();

        System.out.println("sb: "+( strSonra.getNano()-strOnce.getNano())); //cok daha hizli
    }
}
