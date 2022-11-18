package day27_staticKeyword;

public class Rope {
    public static void swing(){  //6.satir //14.satir
        System.out.println("swing"); //7.satir 1. yazdirma "swing" yazar //15.satir tekrar "swing "yazar

    } //8.satir 6.satirdan öncesine yani 5 e gider  //16.satir
    public void climb(){
        System.out.println("climb ");
    }
    public static void play(){ //4. satir  //12.satir
        swing();   //5. satir swinge gönderiyor //13.satir
       // climb();//9. satir      //17.satir
        // statice olmadigi icin cte veriyo obje olusturmak lazim
    } // 18.satir

    public static void main(String[] args) {//1.satir
        Rope rope=new Rope(); //2.satir rope diye obje olusturdu ve rope diye cons olmadigi icin defoult cons calisir.
        rope.play();   //3. satir play methoduna gider.
        Rope rope2=null; //10.satir null degeri atanmis
        rope2.play(); //11.satir play methoduna geri gider
    }       //19.satir
}          //20.satir
    /*
     SONUC:
     swing
     swing

     */
