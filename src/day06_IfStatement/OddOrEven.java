package day06_IfStatement;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

         /*Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        if ( num % 2 == 0 )
            System.out.println("The entered number is even: " + true);
        else {
            System.out.println("The number is odd");
            System.out.println("Enter the number");
            int num1 = input.nextInt();
            if ( num1 >= 0 )
                System.out.println(num1 + " is positive number: true");
            else
                System.out.println(num1 + " is negative number");
            int number1 = 94;
            System.out.println("Enter the number");
            number1 = input.nextInt();
            if ( number1 % 2 == 0 )
                System.out.println(number1 + " is dividable by 2:" + true);
            else if ( number1 % 3 == 0 )
                System.out.println(number1 + " is dividable by 3: " + true);
            else
                System.out.println(number1 + " is dividable by 5: " + true);


        }*/

        int number = 45;

        boolean isEven =  number % 2 == 0; // when we divide a number by 2, if the remainder is 0, means the number is even

        // boolean isOdd = number % 2 != 0; // when we divide a number by 2, if the remainder is NOT 0, means the number is odd

        boolean isOdd = !isEven; // if the number is NOT even, then it's odd

        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number + " is an odd number: " + isOdd);




    }
}