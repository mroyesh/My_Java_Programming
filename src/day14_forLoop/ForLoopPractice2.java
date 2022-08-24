package day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice2 {
    public static void main(String[] args) {


        System.out.println("Enter a number");
        int number = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 0; i <= number;i++){
            sum+=i;
        }
        System.out.println("Sum = "+sum);


      /*Scanner input= new Scanner(System.in);
        System.out.println("enter the word");
        String word= input.nextLine();
        for (char i = 0; i>=word.length()-1 ; i++) {
            System.out.print(i);
        }


        // write a program that can ask the user enter a
        // number for five times, print the maximum number

*/
    }


}
