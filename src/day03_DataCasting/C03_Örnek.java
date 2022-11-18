package day03_DataCasting;

public class C03_Örnek {
    public static void main(String[] args) {
        byte n1=125;

        // byte n2= (n1+1);  hatalı işlem

        byte n2= (byte) (n1+1);  //byte çevirince düzeldi

        //byte sınırları içerisinde olmasına rağmencast to byte yaptık çünkü int. olarak algıladığı için sorumluluğu almıyor
    }
}
