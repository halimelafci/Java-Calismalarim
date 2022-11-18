package day28_statickBlock;

public class C01_StaticBlock {
    static int sayi;
    static {
        System.out.println("statick block calisti");
        //statik blocklar main methoddan da once calisir birden fazla ise en bastan calisir
        //static{} seklinde olusturulur
        //static black
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        System.out.println(sayi);
    }
    static {
        System.out.println("main methodun altindaki static block calisti");
        sayi=10;
    }
}
