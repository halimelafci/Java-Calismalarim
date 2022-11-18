package day08_TernaryOperator;

import java.util.Scanner;

public class C04_Switch {
    public static void main(String[] args) {
        /*
         kullanicidan gun numarasini alip
         1 ise pazartesi,
         ...
         7 ise pazar yazdiralim
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir gün no girin");
        int gunNo= scan.nextInt();
        switch (gunNo){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("pesembe");
                break;
            case 5:
                System.out.println("cuma" );
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("gecerli gün no girin");
        }
    }
}
