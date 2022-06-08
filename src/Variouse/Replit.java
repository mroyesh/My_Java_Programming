package Variouse;

import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {
        String s = "prepinsta";
        String s1 = "";
        s1 = s.replaceAll("[aeiou]", "");
        System.out.println("String after removing vowel : " + s1);
        // in this case we remove vowels from a context/string


        System.out.println("-----------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("enter the word");
        String word= input.nextLine();
        int result= word.length()-1;
        System.out.println("The result is "+result);







        System.out.println("enter the word");
        //String word = input.nextLine().toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if ( word.charAt(i) == 'a' || word.charAt(i) == 'e'
                    || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' ) {
                System.out.println(word.charAt(i));// finding vowels from given string
                // in this method we find vowels from any given string  ^^^^^^^

            }

        }
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < word.length(); i++) {
            System.out.println("" + word.charAt(i));
            // in this method we print every single letters in a separate line
        }

        System.out.println("=========================================");

        String a = "I love you";
        String c = "";
        for(int i = a.length() - 1; i > 0; i--) {
            c += a.charAt(i);
        }
        System.out.println(c);

        System.out.println("---------------------------------");

        String a3 = "Congrats your new job";
        String reverse = "";
        for (int i = a3.length()-1; i >=0; i--) {
            reverse += a3.charAt(i);
        }
        System.out.println(reverse);

        System.out.println("-------------------------------");







        System.out.println("------------------------------");

        System.out.print("Input a string: ");
        String str = input.nextLine();
        System.out.print("The middle character in the string: " + middle(str)+"\n");
    }
    public static String middle(String str) {
        int position;
        int length;
        if (str.length() % 2 == 0) {
            position = str.length() / 2 - 1;
            length = 2;
        }else {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }
        /*int inhabitants = scan.nextInt();
        int day = 0;
        for(; inhabitants > 0; inhabitants/=2) {

            System.out.println("Day " + day + " [" + inhabitants +"]");
            day++;
        }
        System.out.println("---- EXTINCT ----");*/


    }

