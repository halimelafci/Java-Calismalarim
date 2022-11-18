package day37_overridding.deneme;

public class Test08 {
    public static void main(String[] args) {
        X x=new X();
        Y y=new Y();
        y.m2();
        x.m1();
        y.m1();
        x=y;
        x.m1();
        ((Y) x).m2();
    }
}
class X{
    public void m1(){
        System.out.println("m1,X class");
    }
}
class Y extends X{
    public void m1(){
        System.out.println("m1,y class");
    }public void m2(){
        System.out.println("m2, Y class");
    }

}
