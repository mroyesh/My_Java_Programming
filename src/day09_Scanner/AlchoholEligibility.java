package day09_Scanner;

import java.util.Scanner;

public class AlchoholEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        if ( age >= 21 ) {
            System.out.println("You are eligible to purchase alcohol");
        }else{
            System.err.println("you are not eligible to purchase alcohol");
        }
        System.out.println("your age is: "+ age);
    }
}