package day06_IfStatement;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 20;
        System.out.println("Enter a number");
        num = input.nextInt();
        if (num % 2 == 0)
            System.out.println("The entered number is even: true");
        else
            System.out.println("The number is odd");
        int num1 = 300;
        System.out.println("Enter the number");
        num1 = input.nextInt();
        if (num1>=0)
            System.out.println(num1 + " is positive number: true");
        else
            System.out.println(num1 + " is negative number");
        int number1 =94;
        System.out.println("Enter the number");
        number1 = input.nextInt();
        if(number1 % 2 == 0)
            System.out.println(number1 + " is dividable by 2: false");
        else if(number1 % 3 ==0)
            System.out.println(number1 + " is dividable by 3: false");
        else
            System.out.println(number1 + " is dividable by 5: true");



        }
    }