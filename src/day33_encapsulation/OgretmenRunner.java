package day33_encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {


        Ogretmen ogretmen1=new Ogretmen();

        ogretmen1.setIsim("burak");
        System.out.println(ogretmen1.getIsim()); //set ile atama yaptigim icin isim cıkar

        ogretmen1.setSoyİsim("lafci");
        System.out.println(ogretmen1.getSoyİsim());//set ile atama yaptigim icin isim cıkar

        System.out.println(ogretmen1.getBrans());//null atama yapmadim defoult atadi

        ogretmen1.setBrans("yazilim");
        System.out.println(ogretmen1.getBrans());//yazilim



    }
}
