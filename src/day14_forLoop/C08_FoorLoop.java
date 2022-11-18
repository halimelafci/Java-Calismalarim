package day14_forLoop;

public class C08_FoorLoop {
    public static void main(String[] args) {

        //100 den baslayarak 50'ye(dahil)kadar olan sayilari aralarinda virgül olarak ayni satirda yazdirin

        for (int i =100; i >=50; i--) {

            if(i>=50 ){
                System.out.print(i+",");
            }else {
                System.out.println(i);
            }

        }
    }
}
