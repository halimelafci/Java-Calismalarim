package day30_immutableClass;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now(); //simdiki tarih icin kullanilir

        System.out.println(tarih);//2022-07-24 guncel tarihi verir

        System.out.println(tarih.getDayOfYear());//205 yılin kacıncı gunu verir
        System.out.println(tarih.getDayOfWeek());//SUNDAY hangi gun
        System.out.println(tarih.getMonthValue());//7 hangi ay rakamla
        System.out.println(tarih.getMonth());// JULY temmuz ay'i getir
        System.out.println(tarih.isLeapYear());// artik yil mı

        LocalDate tarih2=LocalDate.of(1990,3,15);
        System.out.println(tarih2); //1990-3-15

        LocalDate tarih3=LocalDate.of(1990,Month.MARCH,15);
        System.out.println(tarih3);

        System.out.println(tarih.plusDays(100)); // gun sonrası

        System.out.println(tarih.minusDays(50));

        System.out.println(tarih.minusDays(100).minusMonths(5));

        System.out.println(tarih.isAfter(tarih2));

        //iki farkli dogum gunu girildiginde hangisinin yasını daha buyuk oldugunu bulun

        if(tarih2.isAfter(tarih3)){
            System.out.println(tarih3 +" tarihinde dogan daha buyuk");

        } else if (tarih2.isBefore(tarih3)) {
            System.out.println(tarih2 +" tarihinde dogan daha buyuk");

        } else {
            System.out.println("iki tarih birbiri ile ayni");
        }


    }
}
