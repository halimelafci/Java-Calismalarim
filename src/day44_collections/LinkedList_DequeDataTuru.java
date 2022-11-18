package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedList_DequeDataTuru {

    public static void main(String[] args) {
        Deque<String>ll1=new LinkedList<>();
        ll1.add("Ali");
        ll1.add("Veli");
        ll1.add("Can");
        ll1.add("Gül");
        ll1.add("Can");

        System.out.println(ll1.pop());//ilk elemani  silip getiriyor //ali
        System.out.println(ll1.getLast());//son elemani getiriyo //can
        System.out.println(ll1);//[Veli, Can, Gül, Can]
        System.out.println(ll1.poll());//ilk elemani siler
        System.out.println(ll1);//[Can, Gül, Can]
    }
}
