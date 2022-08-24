package day15_WhileLoop.PracticeTasks;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class FrequesncyOfChar {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str1 = input.nextLine();
        System.out.println("enter the char");
        char ch = input.next().charAt(0);
        int result1 = 0;
        for (int i = 0; i < str1.length() - 1; i++) {
            if ( str1.charAt(i) == ch ) {
                result1 += 1;
            }
        }
        System.out.println(result1);
*/

        Scanner input= new Scanner(System.in);
        System.out.println("Enter string and char");
        String str= input.nextLine();
        char ch= input.next().charAt(0);
        int frequency=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)==ch){
                frequency++;
            }
        }
        System.out.println(frequency);
/*
Create a class named FrequencyOfChar and Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';
                output: 3
                inputs:
                    "Java programming language"
                    'g'
                output: 4
 */
    }
}


