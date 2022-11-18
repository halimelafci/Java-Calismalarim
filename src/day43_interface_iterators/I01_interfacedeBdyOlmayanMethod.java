package day43_interface_iterators;

public interface I01_interfacedeBdyOlmayanMethod {

    void motor();
    public void yakit();
    public abstract String aku();
    /*
    normal bir class da iki tane acsess mod kullanmak imkansiz
    ama assagidaki methoddda oldugu gibi istisnai durumda oluyor demistik. java8 den sonra bu güncelleme geldi
    static olunca direkt ulasiliyor ama difoultta obj olusturmak lazim
     */

    public default void teker(){
        System.out.println("tum arabalarin tekeri vardir");

    }
    public static void direksiyon(){
        System.out.println("Static tum arabalarin direksiyonu vardir");

    }

}
