package day32_stringBuilder;

public class C02_Append_insert {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("java daha ne yapsin");

        sb.append(" ?");
        System.out.println(sb);//java daha ne yapsin ?

        sb.insert(4," herseyi dusunmus,"); //araya ekleme yapar

        System.out.println(sb);//java herseyi dusunmus, daha ne yapsin ?

        sb.insert(22,"vallahi valla",0,5);
        //vallahi kelimesinin
        // 0 dan 5 e kadari 22 indexde yazdir demek
        System.out.println(sb);





    }
}
