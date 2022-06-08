package day15_WhileLoop;

public class tests15 {
    public static void main(String[] args) {
        String a = "happy Now roz to all";
        String b = "";
        for (int i = 0; i < a.length(); i++) {
            if ( b.contains("" + a.charAt(i)) ) {
                continue;
            }
            b += a.charAt(i);
        }
        System.out.println(b);

        /*String first = "firstFirstfirstsecondsecond123123123";
        String second = "";
        for (int i = 0; i < first.length(); i++) {
            if ( second.contains("" + first.charAt(i)) ) {
                continue;
            }
            second += first.charAt(i);

        }
        System.out.println(second);

        String str="1234554321happyhappy";
        String str1="";
        for (int i = 0; i <str.length() ; i++) {
            if(str1.contains(""+str.charAt(i))){
                continue;
            }
            str1+=str.charAt(i);
        }
        System.out.println(str1);*/
    }
}