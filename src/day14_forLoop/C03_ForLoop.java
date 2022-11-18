package day14_forLoop;

public class C03_ForLoop {
    public static void main(String[] args) {

       int toplam=0;

        for (int i =1; i <=10; i++) {

            toplam+=i;

        }
        System.out.println(toplam);  //55


         int toplam2=0;
        for (int i = 50; i >=40 ; i--) {
          toplam2+=i;
        }
        System.out.println(toplam2);  // 455
    }
}
