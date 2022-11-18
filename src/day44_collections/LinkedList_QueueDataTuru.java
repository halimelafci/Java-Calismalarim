package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_QueueDataTuru {

    public static void main(String[] args) {

        Queue<String> obj=new LinkedList<>();

        obj.add("ali");
        obj.add("veli");
        obj.add("can");
        obj.add("Gül");
        obj.add("Cicek");


        System.out.println(obj);//[ali, veli, can, Gül, Cicek]


        //kuyruk sıraya eklerken sona ekler silerken basa ekler

        System.out.println(obj.remove());//bastan siler sildigini yansitir liste bos ise except verir //ali
        System.out.println(obj);//[veli, can, Gül, Cicek]


        System.out.println(obj.poll());//ilk elemani siler bos listede ise null doner //veli sildi
        System.out.println(obj);//[can, Gül, Cicek]

        System.out.println(obj.peek());//ilk elemani yansitir //can
        System.out.println(obj.element());//ilk elemani yansitir //can

        //peek ve element ilk elemani yansitir ama liste bos olursa element except verir peek null verir

        System.out.println(obj.offer("java"));//ekleme yapar ama true döner
        System.out.println(obj);//[can, Gül, Cicek, java] sona ekler


    }
}
