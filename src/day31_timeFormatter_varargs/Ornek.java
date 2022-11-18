package day31_timeFormatter_varargs;

public class Ornek {
    public static void main(String[] args) {

        new Ornek().Go(1,"Hello");
        new Ornek().Go(2,"Hello","Hi");


    }
    public void Go(int x,String...y){
        System.out.println(y[y.length-x]+" "); //Hello
                                              //Hello
    }
}
