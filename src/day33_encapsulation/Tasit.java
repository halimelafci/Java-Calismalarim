package day33_encapsulation;

public class Tasit {

    private   String tasitTuru;
   private boolean muayeneVarMi;
   private int yil;

    public String getTasitTuru() {
        return tasitTuru;
    }

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
    }

    public boolean isMuayeneVarMi() {
        return muayeneVarMi;
    }

    public void setMuayeneVarMi(boolean muayeneVarMi) {
        this.muayeneVarMi = muayeneVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
