package day12_stringManipulation;

public class C08_Odevİki {


    public static void main(String[] args) {

               //String seklinde verilen asagıdaki fiyatlari toplayin
                      //String str1="$13.99"
                      //String str2="$10.55"
                      // ipucu:Double.parseDouble() methodunu kullanabilirsiniz
        String str="$13.99";
        String str2="$10.55";
        String str3 =str.replace("$","");
        String str4=str2.replace("$","");
        double sayi= Double. parseDouble(str3);
        double sayi1= Double.parseDouble(str4);
        System.out.println("$" +(sayi+sayi1));


    }
}
