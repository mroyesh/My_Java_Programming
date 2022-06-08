package day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice2 {
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
        System.out.println("enter the word");
        String word= input.nextLine();
        for (char i = 0; i>=word.length()-1 ; i++) {
            System.out.print(i);
        }


        // write a program that can ask the user enter a
        // number for five times, print the maximum number


    }


}
