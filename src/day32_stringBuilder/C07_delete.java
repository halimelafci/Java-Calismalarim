package day32_stringBuilder;

public class C07_delete {
    public static void main(String[] args) {

        StringBuilder sb =new StringBuilder("java her zaman guzel");

        sb.delete(8,9);
        System.out.println(sb);//java herzaman guzel

        sb.deleteCharAt(8);
        System.out.println(sb);//java heraman guzel


        int son =sb.length();

        for (int i = 0; i <son ; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);
        }
    }
}
