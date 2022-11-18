package day04_Pre_Post_İncrement;

public class C02_PrePost_İncrement {
    public static void main(String[] args) {

        /*
        yazdırma işleminde ise;
        pre olursa önce arttırır sonra yazdırır
        post olursa önce yazdırır sonra arttırır
         */
        int num=15;
        System.out.println(++num);
        System.out.println(num++);
        System.out.println(num);
    }
}
