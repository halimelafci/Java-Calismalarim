package day34_inheritance;

public class Toyota {

    protected String marka="toyota";
    protected String model="model belirtilmedi";
    protected String yakit="yakit belirtilmedi";

    protected void motor(){
        System.out.println("toyota cevreci motorlar kullanir");
    }

    protected void aku(){
        System.out.println("toyota modele gore aku kullanir");
    }
}

