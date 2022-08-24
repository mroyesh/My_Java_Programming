package day11_Stringpart2.PracticeTasks;

import java.util.Scanner;

public class ReallyNreverMind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wania is the best");
        String word = input.nextLine();
        String lastChar = word.substring(word.length() - 2);
        if ( lastChar.equals("ly") ) {  // comparing a word with our given word
            System.out.println("really");
        } else {
            System.out.println("never mind");
        }
        // print two words without first char
        System.out.println("enter the first word");
        String first = input.nextLine();
        System.out.println("enter the second word");
        String second = input.nextLine();
        String result = first.substring(1) + second.substring(1);
        System.out.println(result);

        System.out.println("enter first word");
        String word1 = input.nextLine();

        String result4 = word1.substring(0, 1).toUpperCase() + word1.substring(1).toLowerCase();

        System.out.println("enter your second word");
        String word2 = input.nextLine();
        String result5 = word2.substring(0, 1).toUpperCase() + word2.substring(1).toLowerCase();
        System.out.println(result4 + " " + result5);
    }
}
