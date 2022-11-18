package day21_practice;

public class C05_ {
    public static void main(String[] args) {
        int toplam=0;
        System.out.println("istenen sonuc");
        for (int i = 100; i >0 ; i--) {
            if (i%13==0){
                System.out.println(i);
                toplam+=i;
            }

        }
        System.out.println("toplam = " + toplam);
    }
}
