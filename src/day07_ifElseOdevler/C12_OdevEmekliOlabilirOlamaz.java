package day07_ifElseOdevler;

import java.util.Scanner;

public class C12_OdevEmekliOlabilirOlamaz {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen yaşınızı girin");
        double yas=scan.nextDouble();
        if(yas<65){
            System.out.println("emekli olamazsın calısmalısın");

        } else if(yas>=65){
            System.out.println("emekli olabilirsin");
        }
    }
}
