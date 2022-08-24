package day14_forLoop.PracticeTasts;

import java.util.Locale;
import java.util.Scanner;

public class Palendrome {
    public static void main(String[] args) {

        boolean result = isPalindrome("happy");
        System.out.println("result: =" +result);


        String input = new Scanner(System.in).nextLine().toLowerCase();
        String reverse = "";
        for (int i = input.length() - 1; i > 0; i--) {
            reverse += input.charAt(i);
        }
        if ( input.equals(reverse) ) {
            System.out.println("The word is palindrome");
        } else {
            System.out.println("Word is not palindrome");

        }
        String input1 = new Scanner(System.in).nextLine().toLowerCase();
        String reverse1= "";
        for (int i = input.length()-1; i >= 0; i--) {
            reverse1+=input1.charAt(i);
        }
        if(input.equals(reverse1)){
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");
        }
        // kabul==> length ==5
        // 01234 ==>length-1 ==> 5-1=4*/

    }

    public static boolean isPalindrome( String word){
        String reverse="";
        for (int i =word.length()-1 ; i >0; i--) {
            reverse+=word.charAt(i);
        }
        return true;
    }
}
