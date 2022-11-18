package day50_lamda_practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda02_DosyaOkuma {

    /*
    dosya eklemek icin 2 yol var
    1) Files.lines(Path.of("path")  buradan stream e eklemek icin
    Stream <String> satir=Files.lines(Path.of(".........."));
    bu bize tekrardan stream tanimlamadan kullanmayi saglar
    2) //Files.lines(Paths.get("..........")).  kullanilir
    ==========================================================
    intellj dosya eklemek icin src => new=>file=>text diyoruz ve istedigimiz metni buraya kopyaliyoruz
    bu dosyanin path almak icin dosyanin uzerine gelip sag tikliyoruz(burada dosya C7_TextFile)
    sonrasinda copy path seciyoruz bundan sonra iki secenek var
    1) absolute path seciyoruz yada
    2) path from content root seciyoruz
    her ikisinde de path kopyalamis oluyoruz
    cevirirken EXCEPTION OLUSMASIN DIYE => throws IOException <= EKLEMELIYIZ
    buda lines altinda kirmizi uyari veriyor uzerine tiklayinca kendiliginden oluyor
      */

    public static void main(String[] args) throws IOException {


       // src/day50_lamda_practice/tex

    System.out.println("\nTASK 01 --> siirler.txt dosyasini okuyunuz -->  ");

        Path muti=Path.of("src/day50_lamda_practice/tex");

        Stream<String> akis=Files.lines(muti);
        akis.forEach(System.out::println);

        Files.lines(Path.of("src/day50_lamda_practice/tex")).forEach(Methodlarim::yazdir);

        //soru 1 :
    System.out.println("\nTASK 1  --> siirler.txt dosyasindaki ilk satiri kucuk harflerle yazdirin  -->  ");

      //cevap 1:
     Files.lines(muti).map(String::toUpperCase).limit(1).forEach(System.out::println);

        System.out.println("ilk satir kucuk harflerle : "+Files.lines(muti).map(String::toUpperCase).findFirst().get());

     //soru 2 :
    System.out.println("\nTASK 2 --> siirler.txt dosyasinda hatir kelimesinin kac satirda gectiginiz yazdiriniz -->  ");
     // cevap2 :
    System.out.println(Files.lines(muti).map(String::toLowerCase).filter(t -> t.contains("hatir")).count());


    //soru 3 :
   System.out.println("\nTASK 3  --> siirler.txt dosyasindaki ayni kelimeleri cikartarak y yazdiriniz. -->  ");

    // cevap 3 :
    System.out.println(Files.lines(muti).map(t -> t.split(" ")).
            flatMap(Arrays::stream).distinct().collect(Collectors.toList()));
    //2. yol
        System.out.println(Files.lines(muti).map(t -> t.split(" ")).flatMap(Arrays::stream).collect(Collectors.toSet()));

        //soru 4:
        System.out.println("\nTASK 4 --> siirler.txt dosyasindaki tum kelimeleri natural order  yazdiriniz. -->  ");

        //cevap 4:
    Files.lines(muti).map(t->t.toLowerCase().split(" ")).flatMap(Arrays::stream).sorted().forEach(Methodlarim::yazdir);


     //soru 5 :
    System.out.println("\nTASK 5 --> siirler.txt dosyasinda gonlum kelimesinin kac kere gectigini  yazdiriniz. -->  ");

    //cevap 5 :

        System.out.println("gonlum kelimesi : "+Files.lines(muti).map(t -> t.toLowerCase().split(" ")).
                flatMap(Arrays::stream).filter(t -> t.contains("gonlum")).count());

        //soru 6 :
      System.out.println("\nTASK 6 --> siirler.txt dosyasinda a harfi gecen kelimelerin sayisini ekrana yazdiran programi yazdiriniz. -->  ");

      //cevap 6:
        System.out.println("a harfi gecen kelimeler : "+Files.lines(muti).map(t -> t.toLowerCase().split(" ")).
                flatMap(Arrays::stream).filter(t -> t.contains("a")).count());

       //soru 7 :
        System.out.println("\nTASK 7 --> siirler.txt dosyasinda a harfi gecen kelimeler yazdiriniz. -->  ");

        // cevap 7:
        System.out.println( "a harfi iceren kelimeler : "+Files.lines(muti).map(t -> t.toLowerCase().split(" ")).
                flatMap(Arrays::stream).filter(t -> t.contains("a")).collect(Collectors.toList()));

        //soru 8 :
        System.out.println("\nTASK 8 --> siirler.txt dosyasinda kac /farklı harf kullanildigini  yazdiriniz. -->  ");

        //cevap 8 :
        System.out.println("kac farkli harf kullanildi : "+Files.lines(muti).map(t -> t.replaceAll("\\W", "").
                replaceAll("\\d", "").split("")).flatMap(Arrays::stream).count());


        System.out.println("\nTASK 9 --> siirler.txt dosyasinda kac farkli kelime kullanildigini  yazdiriniz. -->  ");

    System.out.println("\nTASK 10 --> siirler.txt dosyasinda kac farkli kelime kullanildigini  yazdiriniz. -->  ");

    }
}

