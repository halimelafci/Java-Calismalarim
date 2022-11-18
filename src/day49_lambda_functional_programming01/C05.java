package day49_lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C05 {
    public static void main(String[] args) {

    Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
   Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
   Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
   Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);


        List<Courses> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println(ortalamaPuanlarVerilenSayidanBuyukMu( coursesList,78));
        System.out.println(kelieVarMi(coursesList,"Turkish"));
        System.out.println(ortalamaEnYuksekKUrs(coursesList));
        System.out.println(ortalamaPuanaGoreSiralaVeİlkVerilenDegeriAtla(coursesList,1));
    }
    //1)Tüm ortalama puanların verilen sayıdan büyük olup olmadığını kontrol etmek için bir method oluşturun.

    public static boolean ortalamaPuanlarVerilenSayidanBuyukMu(List<Courses>list,int x){

        return list.stream().allMatch(t->t.getAverageScore()>x);
    }
    // 2) kurs adlarindan en az birinin verilen kelimeyi icreip icermedigini kontrol eden bir method olusturun
    public static boolean kelieVarMi(List<Courses> list, String str){
        return list.stream().anyMatch(t->t.getCourseName().contains(str));
    }

      // 3) ortalama puanı en yuksek kursu yazdiran method olusturun

    public static String ortalamaEnYuksekKUrs(List<Courses>list){

    return list.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getCourseName();
    }
    // 4) liste ogelerini artan düzende ortalama puana göre siralayin ve ilk verilenleri atlayin

    public static List<Courses> ortalamaPuanaGoreSiralaVeİlkVerilenDegeriAtla(List<Courses>list, int x){

        return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(x).collect(Collectors.toList());

    }


}
