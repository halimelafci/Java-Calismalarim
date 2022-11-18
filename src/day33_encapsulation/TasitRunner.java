package day33_encapsulation;

public class TasitRunner {
    public static void main(String[] args) {

       Tasit tasit1=new Tasit();

       tasit1.setTasitTuru("kamyon");
        System.out.println(tasit1.getTasitTuru()); //kamyon

        ;
        System.out.println(tasit1.isMuayeneVarMi()); //false
     //get methodunda boolean da get yerine is kullanilir isMuayeneVarMi() set de degismez


        tasit1.setMuayeneVarMi(true);
        System.out.println(tasit1.isMuayeneVarMi());//true


    }
}
