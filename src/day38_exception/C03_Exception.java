package day38_exception;

public class C03_Exception {
    public static void main(String[] args) {
        int a=100;
        int b=50;
        int sayac=1;

        while (sayac<100){
            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) { //istersek hatanin ozel ismini de yazabiliriz  aritmetik hata oldugundan onu yazı
                System.out.println("payda sifirlandi ama kod calismaya devam ediyor");

            }


            b--;
            sayac++;


        }
}
}
