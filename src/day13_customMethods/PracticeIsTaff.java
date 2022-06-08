package day13_customMethods;

public class PracticeIsTaff {
    public static void main(String[] args) {
        String reversee=" happy Pi day";
        String resultt="";
        for (int i = reversee.length()-1; i>0; i--) {
            resultt+=reversee.charAt(i);
        }
        System.out.println(resultt);

       /* String result= reverse("Wooden Spoon");
        System.out.println(result);

    }

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length()-1; i > 0; i--) {
            result += str.charAt(i);
        }
        return result;*/
    }

}
