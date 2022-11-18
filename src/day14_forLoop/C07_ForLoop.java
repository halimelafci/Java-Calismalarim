package day14_forLoop;

public class C07_ForLoop {
    public static void main(String[] args) {

        // verilen bir pozitif tam sayinin
        // pozitif tam bolenlerini yazdiralim

        int sayi=150;
        for (int i = sayi; i >= 1; i--) {
            if( sayi%i==0){
                System.out.print(i +" ");

            }


        }


    }
}
