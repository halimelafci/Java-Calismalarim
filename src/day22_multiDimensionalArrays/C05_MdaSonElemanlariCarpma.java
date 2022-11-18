package day22_multiDimensionalArrays;

public class C05_MdaSonElemanlariCarpma {
    public static void main(String[] args) {
        /*
        Soru 2) Asagidaki multi dimensional array’in
        ic array’lerindeki son elemanlarin carpimini
        ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
         */
        int[][] sayi={{1,4,5},{5,6},{8,7}};
        int carpma=1;

        for (int i = 0; i <sayi.length ; i++) {
            for (int j = 0; j <sayi[i].length ; j++) {
                if (j==sayi[i].length-1){
                    carpma *=sayi[i][j];

                }

            }


        }System.out.println(carpma);
    }
}
