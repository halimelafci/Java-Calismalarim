package day43_interface_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class İterators {
    public static void main(String[] args) {
        /*
        iterators lar interfacedir
        obje olusturulamaz interface oldugu icin
        sadece 3 methodu vardir
        1-next()
        2-hasNext()
        3-remov
         */

        List<Integer>liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
      //obje olusturmaddan önce listeye ekleme yapmak gerekir yoksa RTEX veriyo
        System.out.println(liste);//[10, 20, 30, 40]

        Iterator obj=liste.listIterator() ;
        obj.next(); //bir adm ileri gitti
        obj.remove();//gectigi yerdekini sildi basatn siler ama bir adim sadece
        System.out.println(liste);//[20, 30, 40]

     //hepsini silmek istersek eger;

        while (obj.hasNext()){// yaninda eleman oldugu surece calis
            obj.next(); //yana kay
            obj.remove();//her gectigin elemani sil
        }
        System.out.println(liste); //[] liste bos
    }
}
