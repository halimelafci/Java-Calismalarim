package day06_andOparatorleri;

public class C02_IfStatements {
    public static void main(String[] args) {
        // if şartları birbirinden bağımsız ise ayrı ayrı if ler yazılır
        int sayi=10;
        if (sayi>0)  {
            System.out.println("sayi sıfırdan büyük.");
        }
        if(sayi%2==0){
            System.out.println("sayı çift.");

        }
        if (sayi%5==0){
            System.out.println("sayi beşin katı.");
        }
    }
}
