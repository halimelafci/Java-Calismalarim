package day44_collections;

import java.util.*;

public class Collections_List_DataTuru {
    public static void main(String[] args) {

       /*
       collectionsda 5 kelimeye dikkat ederiz

       1- set (kume)= obje olusturuldugunda bu classin data turunden arama yapılırsa
       ayni elemandan bir tane olur
       2-Queue(sira)=obje olusturuldugunda bu classin data turunden arama yapılırsa
       ekleme bastan yapilir ,silme ise bastan yapilir
       3-Deque=Queue nin child'i hem bestan hem sondan ekleme yada silme yapilir
       queue den daha fazla methodu vardir
       4-LinkedList(bagli)= istenildigi yerden ekleme cıkarma yapilir (halay gibi)
       5-TeereSet(dogal sirali)=bu clas dogal sirali yapar 3,5,7,9 var 8 yazmak istersek
       7 ve 9 arasina koyar
       6-HashCode=hızlı olmasidir en onemli ozelligi
        */

        LinkedList<String> obj1=new LinkedList<>();//en kapsamli assagidakilerin butun methotlari var icinde

        List<String> obj2=new LinkedList<>();//sadece listin ozellikleri var

        Queue<String> obj3=new LinkedList<>();//sadece Queue özellikleri var

        Deque<String> obj4=new LinkedList<>();//Queue ve Deque özellikleri var

        obj2.add("Ali");
        obj2.add("Veli");
        obj2.add("Can");
        obj2.add("Gül");

        System.out.println(obj2);//[Ali, Veli, Can, Gül]
        System.out.println(obj2.remove(1));//1. indexdekini siler //Veli

        obj1.add("Ali");
        obj1.add("Gül");
        obj1.add("halime");
        obj1.add("Can");
        System.out.println(obj1.remove("Gül"));//ismi bulur onu siler index yok ve silince true döner

        obj2.retainAll(obj1);
        System.out.println(obj2);//[Ali, Can]
        //retainAll methodu iki objede ortak olani yazar ve basta yazilan obede yani(obj2) de ki geri kalani siler
       // ama obj1 i degistirmez işlem obj2 de gerceklesir

        System.out.println(obj1);//[Ali, halime, Can]


    }

}
