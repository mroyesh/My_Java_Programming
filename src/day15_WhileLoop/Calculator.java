package day15_WhileLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1= input.nextInt();

        System.out.println("Enter the second number");
        int num2= input.nextInt();

        System.out.println("Enter the math operator");
        char operator= input.next().charAt(0);

        while ( !(operator=='-'|| operator=='+'
        || operator=='*'|| operator=='/')) {
            System.err.println("invalid operator, try again");
            operator= input.next().charAt(0);
        }
        if(operator=='+') {
            System.out.println(num1 + num2);
        }else if(operator=='-'){
            System.out.println(num1-num2);
        }else if(operator=='*'){
            System.out.println(num1*num2);
        }else{
            System.out.println(num1/num2);
        }



        /*System.out.println("Enter the first number");
        int num1= input.nextInt();

        System.out.println("Enter the second number");
        int num2= input.nextInt();

        System.out.println("Enter the math Operator");
        char operator = input.next().charAt(0);


        while ( !(operator=='+'|| operator =='-'
                || operator=='*'|| operator=='/')){
            System.out.println("Not valid operator, try again");
            operator=input.next().charAt(0);
        }
        if ( operator == '+' ) {
            System.out.println(num1+num2);
        }else if(operator=='-'){
            System.out.println(num1-num2);
        }else if(operator=='*'){
            System.out.println(num1*num2);
        }else{
            System.out.println(num1/num2);*/
        }
    }

