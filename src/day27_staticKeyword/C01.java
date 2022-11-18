package day27_staticKeyword;

public class C01 {

        static int sayi=10;
        int rakam=5;

    public static void main(String[] args) {
           C01 obje1=new C01();

        System.out.println("obje1 rakam degeri :"+ obje1.rakam);
        System.out.println("obje1 sayi degeri :"+sayi);

                obje1.rakam+=1;//obje1 objesinin rakmainı arttirdim yeni degeri 5+1=6 oldu
        sayi+=1;// obje1 icindeki sayinin yeni degeri
        System.out.println("obje1 yeni rakam degeri :"+obje1.rakam);//6
        System.out.println("obje1 yeni sayi degeri :"+sayi);//11

            C01 obje2=new C01();
        System.out.println("obje2 rakam degeri :"+ obje2.rakam);
        System.out.println("obje2 sayi degeri :"+sayi);

                obje2.rakam++;
        sayi++;
        System.out.println("obje2 yeni rakam degeri :"+obje2.rakam);
        System.out.println("obje2 yeni sayi degeri :"+sayi);
    }

}
