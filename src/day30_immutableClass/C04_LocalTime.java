package day30_immutableClass;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time=LocalTime.now();

        System.out.println(time);//19:14:02.126822600

        Thread.sleep(3000);

        System.out.println(time);
    }
}
