package day38_exception;

public class C01_Exeptions {
    public static void main(String[] args) {


        int a=100;
        int b=50;
        int sayac=1;

        while (sayac<100){

            if (b==0){
                System.out.println("islem yapilirkrn payda 0 oldu dikkat etmeliisn" );
            }else {
                System.out.println(a/b);
            }

            b--;
            sayac++;

        }
    }
}
