package day13_methodCreation;

public class C01_metodCreation {
    public static void main(String[] args) {


        //verilen 5 harfli kelimeyi tersten yazdiran method

        String input="burak";

        terstenYazdır( input);
    }


    public static void terstenYazdır(String input) {

        String tersİnput=input.substring(4)+
                input.substring(3,4)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);

        System.out.println( tersİnput);
    }
}
