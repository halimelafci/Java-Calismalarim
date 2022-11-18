package practice04.resturaunt;

public class Musteri {
    public static void main(String[] args) {


        Mutfak menu = new Mutfak();

        System.out.print("menu.toString "+menu.toString());

        Mutfak siparislerim=new Mutfak("adana kebab","corba","baklava","ayran");

        System.out.println( siparislerim);
        /*
        Mutfak{
       yemekler='adana kebab'
       araSicaklar='corba'
       tatlilar='baklava'
       icecekler='ayran'}

       */
        Mutfak siparis=new Mutfak("adana kebap","ayran");
        System.out.println(siparis);

    }
}
