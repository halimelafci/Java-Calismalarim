package day27_staticKeyword;

public class MyConstructor {



             int x=3;
             int y=5;
    MyConstructor(){                                     //7.satir
        x+=1;                                       //8. satir x instence degerini alir(3)+1=4
        System.out.println("-x"+x);             //9.satir 1.yazdirma (OLARAK BU SATİR YADİRİLİR) -x 4 yazdirir.
    }                                           //10.satir geldigi yere geri döner(7den öncesine)
     MyConstructor(int i){                      //5. satir i=3
         this();                                //6.satir parametresiz cons git
        this.y=i;                                //11. satir y'ye i'nin degerini atamis(3)5.satirda y=3
        x+=y;                               //12.satir x scopede atanmadigindan instance 8.satirdaki (4) dgerini aldi ve y'yedegerini ekledi4+3=7
        System.out.println("-x"+x);        //13.satir 2. yazdirma (OLARAK BU SATİRİ YAZDİRİR)-x7 yazar

                                                    } //14.satir geldigi yere geri döner5 den öncesine
    MyConstructor(int i,int i2){                        //3. olarak buarsi calisir i=4 i2=3
         this(3);                                //4.satir 1 parametreli cons git

         this.x-=4;                             //15.satir x scoped deger verilmedigi icin 12. satirdaki 7 degerini alirve 4 cikarir 7-4=3 olur
        System.out.println("-x"+x);         //16.satir 3.yazdirma (OLARAK BU SATİRİ YADİRİR) -x3 yazar
    }                                           //17. satir

    public static void main(String[] args) {               //1. satirdan baslar
        MyConstructor mc1=new MyConstructor(4,3);   //2. satir 2 parametreli cons gider

    }                                                          /*SONUC:-x4
                                                                       -x7
                                                                       -x3
                                                    NOT: 11. satirdaki this.y=i;   direkt olarak bje üzerindeki veraible ye bakar
                                                    farkli bir obje olususturulursa instance degerine bakar
                                                                        */



}
