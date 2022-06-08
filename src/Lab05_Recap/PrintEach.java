package Lab05_Recap;

import java.util.Scanner;

public class PrintEach {
    public static void main(String[] args) {

        //String word1= new Scanner(System.in).nextLine();    // we use this if we need only use one time

        String str="Happy frinds day";
        for (int i = 0; i <str.length() ; i++) {
            char ch= str.charAt(i);
            System.out.println(ch);

        }

        String word = "Wooden Spoon";
        for (int i = 0; i <= word.length() - 1; i++) {    // if we use < we can use length without -1,
            char each = word.charAt(i);      // prints each char separately.
            System.out.println(each);
        }
        String word2=" happy birthday";
        for (int i = 0; i <= word2.length()-1; i++) {
            char result= word2.charAt(i);
            System.out.print(result);
        }

    }
}
