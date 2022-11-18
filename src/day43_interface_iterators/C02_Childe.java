package day43_interface_iterators;

public class C02_Childe implements I01_interfacedeBdyOlmayanMethod{
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }

    public static void main(String[] args) {

        I01_interfacedeBdyOlmayanMethod.direksiyon();//statik oldugu icin hemn geldi

        C02_Childe obj=new C02_Childe();
        obj.teker();//defoult oldugu icin obj olusturduk
    }
}
