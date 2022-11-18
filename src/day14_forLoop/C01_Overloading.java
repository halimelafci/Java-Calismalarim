package day14_forLoop;

public class C01_Overloading {
    public static void main(String[] args) {


        //birden fazla ayni isimde method varsa (replace,substring vs..)
        //Java hangisinin kullanilacagina parametre sayisi ve parametrelerin data türüne göre karar verir

        String str="Java cok guzel";
        str.substring(2); //iki tane substring olmasina ragmen sorun cikarmiyor parametre sayisi yada data turu farkli
        str.substring(2,4);
        str.replace('c','v');
        str.replace("J","H");
        System.out.println(str);

        //Ayni isimde ama farkli methodlari oluşturmak icin degistirilebilinicek seyler
        //1-parametre sayisi
        // 2-ayni parametreye sahip olsa bile para metrelerin data türleri
        //3-ayni sayida ve ayni data türünde parametreleri varsa parametrelerin siralanisi




    }
}
