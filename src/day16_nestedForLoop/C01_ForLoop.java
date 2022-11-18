package day16_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        // verilen String'deki kullanilan harfleri
        // tekrarsiz olarak yazdirip
        // kelimede kullanilan farkli harf sayisini veren bir method yaziniz

        String input = "Java cok guzel ama cok zor";
        tekrarsizYap(input);

    }

    public static void tekrarsizYap(String input) {
        String benzersizInput="";
        String yeniCumle=input.replaceAll("\\W","" );
        System.out.print(yeniCumle.substring(0,1));
        benzersizInput=yeniCumle.substring(0,1);
        for (int i = 1; i < yeniCumle.length(); i++) {
            if (!benzersizInput.contains(yeniCumle.substring(i,i+1))){
            System.out.print(", "+yeniCumle.substring(i,i+1));

            benzersizInput+=yeniCumle.substring(i,i+1);}
        }

        System.out.println("");
        System.out.println(input);
        System.out.println(benzersizInput);




    }
}
