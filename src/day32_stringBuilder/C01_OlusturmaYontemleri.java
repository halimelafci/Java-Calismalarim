package day32_stringBuilder;

public class C01_OlusturmaYontemleri {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder(); //hafiza yönetimi onemli ise bos olusturup tek tek eklemek
        // daha tasarruflu olur. sb2 de ekleme yapmak istersek otomatikmen hafizada 16 yer ayirir hepsini
        // kullanmasak bile 16 olusturur

        StringBuilder sb2=new StringBuilder("java candir");

        StringBuilder sb3=new StringBuilder(10);

        System.out.println(sb1.length());   //0
        System.out.println(sb1.capacity()); //16

        System.out.println(sb2.length());  //11
        System.out.println(sb2.capacity()); //27

        System.out.println(sb3.length());  //0
        System.out.println(sb3.capacity()); //10

        sb1.append("java");
        System.out.println(sb1.length()); //4
        System.out.println(sb1.capacity()); //10

        sb1.append("candir");
        System.out.println(sb1.length()); //10
        System.out.println(sb1.capacity()); //16

        sb1.append(" bilen bilir");
        System.out.println(sb1.length());  //22
        System.out.println(sb1.capacity()); //34
    }
}
