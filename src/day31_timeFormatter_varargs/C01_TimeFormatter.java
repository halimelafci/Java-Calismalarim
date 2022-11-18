package day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat= LocalDateTime.now();
        System.out.println("ilk olusturulan tarih : "+tarihSaat); // 2022-07-26T15:12:58.409267500

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yy HH:mm" ); //formati istedigimiz gibi secebiliriz
        // buyuk HH  24 saat, kucuk hh ise 12 saatlik dilimi yansitir.
        System.out.println(dtf.format(tarihSaat)); //26/07/22 03:19


        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MMM/yyyy hh:mm a" );
        System.out.println(dtf2.format(tarihSaat));
        //26/Tem/2022 03:22 ay kısminda 3 M yazılırsa ilk uc harfini yansıtır
        // Sona koydugum 'a'harfi ise ögleden once veya sonra oldugunu belirtir

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("d-MMMM-y HH:mm" );
        System.out.println(dtf3.format(tarihSaat));//26-Temmuz-22 15:2 tek 'y' ve tek 'd' tam yazdiriyor





    }
}
