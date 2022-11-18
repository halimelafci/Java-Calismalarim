package day32_stringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {


        StringBuilder sb=new StringBuilder("kayra");
        sb.subSequence(0,2);
        System.out.println(sb);//kayra Atama yapilmadigi icin kalıcı degisiklik olmadı. cunku String döndüren methodu
        System.out.println(sb.subSequence(0,3));//kay kalici olarak olmadı burda
        System.out.println(sb);//kayra




    }
}
