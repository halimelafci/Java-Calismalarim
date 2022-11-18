package day42_abstractClass_interfaces;

public interface I02_Interfaces {


        int SAYİ=20;
        /*
        interfacede veriebler final oldugu icin ilk atama yapildiginda deger verilmeli daha sonradan
        deger tama yapilmaz int SAYİ; bu sekilde olmaz

         */


     void yakit();


     public void motor();


     public abstract void teker();

     /*interfacede normalde methodlarda bady olmaz ama istisnai durum da
      eski sistem bozulmasin diye badili method eklemek istersen basina static yazmak zorundayiz.
      istisnai durum :interfaceye sonradan abstract method eklemek istersek daha önceki implement etmis claslara
      override etmek zorunda oldugundan bu da mesakkatli zor olacagi icin java boyle bir istisna yapmis

      */



    }


