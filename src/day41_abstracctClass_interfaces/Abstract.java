package day41_abstracctClass_interfaces;

public abstract class Abstract {
    public static void main(String[] args) {
        /*
        bu class da sitandartlar belirlenir basina abstact keywordu yazmak gerekir
        bu class da normal method yani abstcat class olmayan methodlar da olustutulur
        bu class da obje olusrurulmaz

         */
    }
    public static void toplama(){
        System.out.println(4+3);
        //obje olmadan yazmiyor

    }
    public abstract void cikarma();

    /*
    abstract class da body olmaz
    static,final ve private olmaz

     */
    public abstract void mod();
}
