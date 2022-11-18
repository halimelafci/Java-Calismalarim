package day30_immutableClass;

public class C02_StringHavuzu {
    public static void main(String[] args) {
        String str1="Ali Can";
        String str2=str1+"";
        String str3=new String("Ali Can");
        String hiclik="";
        String str4=str1.concat(hiclik);
        String str5=str1;
        String srt6="Ali Can";

        System.out.println(str1==str2);// false
        System.out.println(str1.equals(str2));//true

        System.out.println(str1==str3);// false ici ayni olsa bile islem yapıldıgı ıcın referansına bakar false olur
        System.out.println(str1.equals(str3));// true icerigine bakar aynı oldgu icin true

        System.out.println(str1==str4);//true
        System.out.println(str1.equals(str4));//true

        System.out.println(str2==str4);//false
        System.out.println(str2.equals(str4));//true

        System.out.println(str1==str5);//true
        System.out.println(str1.equals(str5));//true

        System.out.println(str1==srt6);//true
        System.out.println(str1.equals(srt6));//true

        //str1 ve str6 icerik aynı ama faklı objeler olmasina ragmen ikisinde de true oldu
        // cunku java önce icerige bakar bire bir ayniysa yeni referans olusturmaz var olan referansin icine koyar
        //ama icerigin saginda + islemi varsa (System.out.println(str2==str4);//false) bunun gibi icerik aynı olsa bile
        // farkli referans oldugundan false olur sonucu

    }
}
