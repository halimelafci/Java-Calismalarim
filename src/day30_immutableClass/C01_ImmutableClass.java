package day30_immutableClass;

import java.util.ArrayList;
import java.util.List;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("kenan");
        list.add("ali");
        list.add("veli");
        System.out.println(list);//[kenan, ali, veli

        list.set(1,"yasemin");

        list.remove(2);
        System.out.println(list);//[kenan, yasemin]

    }
}
