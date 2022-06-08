package day16_NestedLoop;

import java.util.Scanner;

public class LoopCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer = "yes";

        while (answer.equals("yes")) {

            System.out.println("Enter first number");
            double n1 = input.nextDouble();

            System.out.println("Enter math Operator");
            char operator = input.next().charAt(0);

            while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.err.println("Invalid entry, try again");
                operator = input.next().charAt(0);
            }
            System.out.println("Enter second number");
            double n2 = input.nextDouble();

            double result = (operator == '+') ? n1 + n2 : (operator == '-') ? n1 - n2
                    : (operator == '*') ? n2 * n2 : n1 / n2;
            System.out.println("result = " + result);

            System.out.println("would you like to continue? yes or no");
            answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("invalid entry,would you like to continue yes or no");
                answer = input.next().toLowerCase();

            }
        }
    }
}

/*
Write a program for a simple calculator
			1.1 ask the user to enter first number: (double)
			1.2 ask the user to enter a math operator: (-, +, *, /)
				if the user enters invalid math operator, reapet the same step until user enters a valid operator

			1.3 ask the to enter the second number: (double)
			1.4 display the calculation result
			1.5 Would you like to continue? (Yes/No)
 */
