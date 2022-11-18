package day38_exception;

public class C02_Exceptions {
    public static void main(String[] args) {
        int a=100;
        int b=50;
        int sayac=1;

        while (sayac<100){

            try {
                System.out.println(a/b); //burda hatayi yakaliyor uyari vriyor ama isleme devam ediyor
            } catch (Exception e) { //e harfi veriable ismi
                // Eseption hatanin genel parenti (ismi) verilen hata ismi de yazılabilir
                System.out.println("islem yapilirkrn payda 0 oldu dikkat etmeliisn");

            }


            b--;
            sayac++;

        }
    }
    }

