package day13_customMethods;

import java.util.Scanner;

public class WarmupTasks {
    public static void main(String[] args) {
        calculator(700, 400, '/');
        ageGroup(32);
        eligibleToVote(6, true);

        /*Scanner input = new Scanner(System.in);
        System.out.println("enter two numbers and math operator");
        double num1= input.nextDouble(),
                num2 = input.nextDouble();
        char operator = input.next().charAt(0);
        calculator(num1, num2, operator);*/


    }

    public static void calculator(double num1, double num2, char mathOperator) {
        switch (mathOperator) {


            case '+':
                System.out.println(num1 + " " + mathOperator + " " + mathOperator + " " + num2 + "=" + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " " + mathOperator + " " + mathOperator + " " + num2 + "=" + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " " + mathOperator + " " + mathOperator + " " + num2 + "=" + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " " + mathOperator + " " + mathOperator + " " + num2 + "=" + (num1 / num2));
                break;
            default:
                System.out.println("Invalid " + mathOperator);
                break;
        }


        /*1. Create a method named calculate that can take three arguments:
        num1 (double)
        num2 (double)
        mathOperator (char)

        The method should display the calculation result of those two numbers as long as the 3rd argument is a
        valid math operator, otherwise the method prints "Invalid Operator"

        Ex:
        calculate(10, 20, '+')

        output:
        10 + 20 = 30


        /*2. Create a method named ageGroup that can print the age group of the person

        age groups are:
        Teenager (< 21)
        Adult   (>=21 && <55 )
        Senior  ( > 55 )*/


    }

    public static void ageGroup(int age) {
        if ( age >= 0 && age <= 150 ) {
            System.out.println((age < 21) ? " teenager" : (age < 55) ? "adult" : "senior");
        } else {
            System.out.println("invalid");
        }
    }

    public static void eligibleToVote(int age, boolean isAmerican) {
        if ( age >= 18 && isAmerican ) {
            System.out.println("eligible to vote");
        } else {
            System.out.println("not eligible to vote");
        }


    /*2. Create a method named ageGroup that can print the age group of the person

        age groups are:
        Teenager (< 21)
        Adult   (>=21 && <55 )
        Senior  ( > 55 )*/
    }
}