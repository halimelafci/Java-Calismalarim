package day32_stringBuilder;

public class C08_equals_compare {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("java");
        StringBuilder sb1=new StringBuilder("java");
        String str =("java");

        System.out.println(sb.equals(sb1));//false
        //ici aynı olsa bile false cıkar

        System.out.println(sb.equals(sb));//true
        //ancak aynı obje olursa true cıkar


        System.out.println(sb.compareTo(sb1));// yani 0 fark var bire bir aynı

        StringBuilder sb3=new StringBuilder("jave"); //-4
        System.out.println(sb.compareTo(sb3));


    }
}
