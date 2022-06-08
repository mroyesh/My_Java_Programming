package Variouse;

import java.util.Scanner;

public class Practice6_2_22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the word");
        String word= input.nextLine();
        System.out.println("Enter the sentence");
        String sentence= input.nextLine();
        boolean result= sentence.contains(word);
        System.out.println(result);

        System.out.println("----------------------");
        System.out.println("enter the string");
        String str= input.nextLine().toLowerCase();
        int result1=0;
        while( str.contains("hi")){
            str= str.replaceFirst("hi","");
            result1++;
        }
        System.out.println(result1);




    }


    }



