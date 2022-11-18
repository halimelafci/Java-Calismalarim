package practice08_interviewSoruCozumu;

public class C02 {
    public static void main(String[] args) {


        /*
     Stringi ters cevirmek icin bir Java Programi yazin
       1.Yol: StringBuilder () kullanarak
       2.Yol: String Classini kullanarak
       3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
  */
      String str="All is well";

      StringBuilder str1=new StringBuilder();
      str1.append(str);

        System.out.println("str : "+str);

        String tersStr=str1.reverse().toString();//toString yaparak tekrar stringe cevirdik
        System.out.println( "ters Str : "+tersStr);

        System.out.println("2. yol");
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print( str.charAt(i));

        }




    }
}
