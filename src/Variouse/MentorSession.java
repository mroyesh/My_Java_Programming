package Variouse;

import java.util.Scanner;

public class MentorSession {
    public static void main(String[] args) {
        int targetNUmber = 42;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number guess (1-100)");
        int number = input.nextInt();
        while ((number != targetNUmber)) {
            if ( number > targetNUmber ) {
                System.out.println("your number is biggenr than target number");
            }
            System.err.println("your guess is not correct, try again");
            number = input.nextInt();
        }
        System.out.println("good job ");

    }
}