package day29_passByValue_immutable;

public class C04_Immutable {
    public static void main(String[] args) {
       /*
         Immutable : degistirilemez
         mutable   : degistirilebilir
         en meshur immutable class : String
         */
        String str="yildiz bank";
        System.out.println(str.toUpperCase());//YİLDİZ BANK

        str.toLowerCase();

        System.out.println(str);//yildiz bank

        str.substring(3,5);

        System.out.println(str);//yildiz bank
        //hangi degisiklik yapılırsa yapılsın str ilk degerini hep koruyo degismez

        // Java'da String gibi metin ifadelerde kullanabilecegimiz
        // mutable StringBuilder class'i da vardir

        StringBuilder sb=new StringBuilder("java bank");

        System.out.println(sb);//java bank

        sb.reverse();

        System.out.println(sb);//knab avaj

        sb.append(".");

        System.out.println(sb);//knab avaj. yapilan degisiklikler kalici olarak kaydediyor
    }
}
