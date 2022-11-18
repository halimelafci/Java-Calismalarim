package practice04.resturaunt;

public class Mutfak {

    public String yemekler="adana kebap, urfaciger,kusbasi kusleme";
    public String araSicaklar="yayla corbasi corba";
    public String tatlilar="baklava kunefe";
    public String icecekler="kola ayran";



    public Mutfak() {

    }

    public Mutfak(String adana_kebab, String corba, String baklava, String ayran) {
        this.yemekler=adana_kebab;
        this.araSicaklar=corba;
        this.tatlilar=baklava;
        this.icecekler=ayran;

    }

    public Mutfak(String adana_kebap, String ayran) {

        this.yemekler =adana_kebap;
        this.icecekler=ayran;
    }


    @Override
    public String toString() {
        return "\nMutfak{" +
                "\nyemekler='" + yemekler +'\'' +
                "\naraSicaklar='" + araSicaklar + '\'' +
                "\ntatlilar='" + tatlilar + '\'' +
                "\nicecekler='" + icecekler + '\'' +
                '}';
    }
}
