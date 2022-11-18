package practice03;

import java.util.Arrays;
import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        farkiniBul();
    }

    private static void farkiniBul() {
        Scanner scan =new Scanner(System.in);
        System.out.println("Array uzunlugunu girin");
        int uzunluk=scan.nextInt();
        int arr[]=new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("arrayin "+(i+1)+" elemanini girin : ");
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Arraydeki enbüyük eleman ile en kucuk eleman arasindaki fark : "+(arr[uzunluk-1]-arr[0]));

    }
}
