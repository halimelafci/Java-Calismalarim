package practice03;

public class C02 {
    public static void main(String[] args) {


        // int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
// verilen array de once cift olan sayilari, sonra da tek olan sayilari for each loop kullanarak yazdiriniz..
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
        System.out.println("cift sayilar :");
        for (int eaceh:arr){

              if (eaceh%2==0){
                  System.out.print(eaceh+" ");
              }

        }
        System.out.println();
        System.out.println("tek sayilar :");
        for (int item:arr){
              if (item%2==1){
                  System.out.print(item+" ");
              }

        }
    }
}
