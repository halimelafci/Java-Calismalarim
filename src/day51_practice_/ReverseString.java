package day51_practice_;

public class ReverseString {
    public static void main(String[] args) {
        String name="Java dunyasi";

        System.out.println(reverse(name));
    }

    public static String reverse(String name){
        String str2="";
        String []str=name.split("");

        for (int i =str.length-1;i>=0;i--){
            str2=str2+str[i];
        }
        return str2;
    }
}
