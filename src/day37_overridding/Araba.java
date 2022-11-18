package day37_overridding;

public class Araba {

    void marka(){
        System.out.println("her arabanini markasi var");
    }
    void yakit(){
        System.out.println("tum arabalar yakitlidir");
    }
}
     /*
     overloading ayni class da ayni isimde metohod olusmak ama olusturmak istersek ya
     parametre sayisini ya da
     parametre data turunu ya da parametrelerin yerlerini degistirmel gerekir.


     overriding de ise farklı class da (iheritance class) ayni isme sahip olan method olusur ve
     bodysini degismek gerekir bu sekide cihilde class da ustune yeni bir methodu yazabilsin


      */