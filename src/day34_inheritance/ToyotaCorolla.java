package day34_inheritance;

public class ToyotaCorolla extends Toyota {
    public static void main(String[] args) {

        ToyotaCorolla arb1=new ToyotaCorolla();


     //System.out.println(arb1.model);model li parent class da private oldugundan burda cikmaz

        System.out.println(arb1.marka);//toyota
        System.out.println(arb1.model); //model belirtilmedi


    }




}
