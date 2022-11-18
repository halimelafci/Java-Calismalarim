package day43_interface_iterators.sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04 {
    public static void main(String[] args) {


     /*
        lstiterator İterators un child i olmasina ragmen daha fazla methodu vardir
        daha kullanislidir iterators a göre
         */

        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(47);
        liste.add(35);
        liste.add(61);
        liste.add(44);

        ListIterator obj = liste.listIterator();

        System.out.println(liste);//[10, 47, 35, 61, 44]

        while (obj.hasNext()) {
            Integer temp = (Integer) obj.next() + 2; // NonPirimitve oldugu icin int kabul etmez casting yapmak gerekir
            obj.set(temp);//teker teker arttirilmis elemanlari set ile degistirdik

        }
        System.out.println(liste);

        while (obj.hasPrevious()) {
            Integer temp = (Integer) obj.previous() - 2;//sondan geliyor
            obj.set(temp);

        }
        System.out.println(liste);
    }
}