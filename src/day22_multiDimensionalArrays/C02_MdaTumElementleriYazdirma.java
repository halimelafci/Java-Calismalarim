package day22_multiDimensionalArrays;

public class C02_MdaTumElementleriYazdirma {
    public static void main(String[] args) {
        // verilen bir multi-dimensional array'in
        // tum elementlerini yazdiran bir method olusturun
        
        int[][] sayilar ={{1,2,3 },{3,4,5},{6,7,8,9}};

       elementleriYazdir(sayilar);
            
  
    }

    public static void elementleriYazdir(int[][] sayilar) {
        for (int i = 0; i <sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length; j++) {
                System.out.print(sayilar[i][j]+ " ");//1 2 3 3 4 5 6 7 8 9

            }
            
        }
    }

}

