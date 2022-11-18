package day35_InheritancedeConstructurKullanimi;

public class Childe extends BParent {

    String isim="childe isim belirtilmed";

    Childe(){
        System.out.println("Childe parametresiz cons calisti");

    }

    public static void main(String[] args) {
        Childe chld1 =new Childe();


    }



}
