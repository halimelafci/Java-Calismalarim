package day27_staticKeyword;

public class Deneme {

     static int count=0;
     public void increment(){           //5.satir
         count++;                       //6.satir static oldugudan voiden direkt ulasildi degeri1 oldu //9.satir
     }                                  //7.satir


    public static void main(String[] args) {    //1.satir

         Deneme obje1=new Deneme();              //2.satir

         Deneme obje2=new Deneme();               //3.satir

         obje1.increment();                          //4.satir
         obje2.increment();                          //8.satir iki kere increment te gitti degeri 2 oldu

        System.out.println("obje1 :"+obje1.count);   //10.satir 1 kere incremente gitti ama statik oldugu icin
        // count tun son halini alir yani sonuc: obje1 :2
        System.out.println("obje2 :"+obje2.count);  //11.satir sonuc: obje2 :2
    }

}
