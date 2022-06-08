package Utilities;

import java.util.Scanner;

public class StringUtilityForMySelf {
    public static void main(String[] args) {

       /* Scanner input = new Scanner(System.in);

        System.out.println("enter the string and char");
        String str = input.nextLine();
        char charr = input.next().charAt(0);
        int result = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if ( str.charAt(i) == charr ) {
                result += 1;
            }
        }
        System.out.println("result =" + result);

        String input1 = "CH1245INA";
        int sumdigits = 0;
        for (int i = 0; i < input1.length(); i++) { // 0==48 and so on it comes from asccii table
            if ( input1.charAt(i) >= 48 && input1.charAt(i) <= 57 ) {
                sumdigits += input1.charAt(i) - 48;
            }
        }
        System.out.println("sumdigits = " + sumdigits);

        String a = "happy Now roz to all";
        String b = "";
        for (int i = 0; i < a.length(); i++) {
            if ( b.contains("" + a.charAt(i)) ) {
                continue;
            }
            b += a.charAt(i);
        }
        System.out.println(b);

        String name = "java is hard to learn, but it is fun too";// the string we want to reverse
        String reverse = "";// the string we want to get on the council
        for (int i = name.length() - 1; i >= 0; i--) {//i: index number of the given string starting from last index to index 0
            reverse += name.charAt(i);//i: index number of the given string starting from last index to index 0
        }
        System.out.println(reverse);

        String input = new Scanner(System.in).nextLine().toLowerCase();
        String reverse = "";
        for (int i = input.length() - 1; i > 0; i--) {
            reverse += input.charAt(i);
        }
        if ( input.equals(reverse) ) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not palindrome");
        }
        String input1 = new Scanner(System.in).nextLine().toLowerCase();
        String reverse1 = "";
        for (int i = input1.length() - 1; i >= 0; i--) {
            reverse1 += input1.charAt(i);
        }
        if ( input1.equals(reverse1) ) {
            System.out.println("is palindrome");
        } else {
            System.out.println("not palindrome");



        }

        public static String reverse(String word) {

            String reverse = "";

            for (int i = word.length() - 1; i >= 0; i--) {    // use from the last initialization or last index number
                char each = word.charAt(i);   /// i: index number of string (word) starting from last index to 0.
                reverse += each;
            }
            return reverse;


        }

        public static String removeDup(String str){
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                //if(result.indexOf(each)<0){
                if ( !result.contains("" + each) ) {  // before adding characters to new string ,we check if the character is not included in the string
                    result += each;

                }
            }
            return result;
        }

        public static int frequency(String str, char ch){
            int count=0;
            for (int i = 0; i <str.length() ; i++) {
                if(str.charAt(i)==ch){
                    count++;
                }
            }
            return count;*/
        }
    }



