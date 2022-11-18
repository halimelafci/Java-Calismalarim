package day42_abstractClass_interfaces;

public class K_Childeİnterface implements I01_Interfaces,I02_Interfaces {
    /*
    bir classi birden fazla interface implements yapabilir bunu yaparken de implements keywordu kulanilir
    abstract claslarda bu sekşlde yapmak imkansiz ama interfacde birden fazla parent'i olabilir.
    bir interfaceye bir clas parent olmaz

    ayni iismde verable olursa once interface yazilir . konur ve istedigin parentteki verableyi soutta yazdirirsin
     */

    public static void main(String[] args) {
        System.out.println(I01_Interfaces.SAYİ);//45
        System.out.println(I02_Interfaces.SAYİ);//20
        System.out.println(İSİM); //HALİME   isim bir tane olmadigi icin direkt yazdi
    }


    @Override
    public void yakit() {

    }

    @Override
    public void motor() {

    }

    @Override
    public void teker() {

    }
}
