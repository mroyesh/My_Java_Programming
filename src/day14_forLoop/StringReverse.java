package day14_forLoop;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverse("happy ali"));


    }

    public static String reverse(String str) {
        String a= "Happy friday";
        String result="";
        for (int i = a.length()-1; i >=0 ; i--) {
            result+=a.charAt(i);
        }
        System.out.println(result);
        return result;


    }

}