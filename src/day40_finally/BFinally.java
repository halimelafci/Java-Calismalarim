package day40_finally;

public class BFinally extends AFinally {

    public static void main(String[] args) {

        BFinally obj=new BFinally();
        obj.isim="burak"; //isim degisir cunku finally degil


        System.out.println(AFinally.OKUL); //OKUL FİNALLİY OLDUGU İCİN DEGİSMEZ

        /*
        3 tane ;
       1- final keywword  --> degismeyecek veriablede kullanilir
       2- finally kod bulogu --> try-catch de kullanilir ve herhalukarda calisir
       3- finalize methodu --> garbege collector kullanilmayan objeleri temizler (çöpcü)
         */

    }
}
