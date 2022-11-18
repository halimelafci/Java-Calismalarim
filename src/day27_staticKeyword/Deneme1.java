package day27_staticKeyword;

public class Deneme1 {

       int x;
       static int y;

       Deneme1(int i){   //3.satir burda i=2                              //8.satir i= yeni degeri 3 oldu
           x+=i;         //4.satir x=i yani x=2 oldu                      //9.satir x= 3 oldu
           y+=i;         //5.satir y static deger y=i sonuc:y=2 oldu      //10.satir y=2+3=5 oldu
       }                //6 satir geldlgln yere geri dön                  //11.satir geldigin yere geri dön

    public static void main(String[] args) {   //1.satir

           new Deneme1(2);                   //2.satir

           Deneme1 dnm=new Deneme1(3); //7.satir
        System.out.println(dnm.x+","+dnm.y); //12.satir yazdirir        SONUC:X=3,Y=5
    }
}
