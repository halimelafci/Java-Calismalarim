package day40_finally;

public class A {
    public static void main(String[] args) {

        String s="";
        try {
            s+="t"; //t ekle
        }catch (Exception e){ //exception varsa yakala
            s+="c"; // ve bunu yaz ama exception olmadigi icin catch hic calismaz
        } finally {
            s+="f";
        }
        s+="a";
        System.out.println(s); //tfa yazar finally blogu herhalukarda calısır ama cte hatasi yoksa tabi
    }
}
