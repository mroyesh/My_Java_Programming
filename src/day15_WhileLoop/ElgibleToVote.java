package day15_WhileLoop;

import java.util.Locale;
import java.util.Scanner;

public class ElgibleToVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = input.nextInt();
        while (!(age > 1 && age < 120)) {
            System.err.println("sorry wrong entry, try again");
            age = input.nextInt();

        }
        System.out.println("are you US citizen? (yes or no)");
        String yesNo = input.nextLine().toLowerCase();

        while (!(yesNo.equals("yes")|| yesNo.equals("no"))) {
            System.out.println("Wrong entry, try again");
            System.out.println("are you US citizen?");
            yesNo = input.next().toLowerCase();
        }
        if ( age >= 21 ) {
            System.out.println("you are eligible to vote");
        }else {
            System.err.println("you are not eligible to vote");


        /*System.out.println("Enter the age");
        int age = input.nextInt();
        while (!(age > 1 && age < 120)) {
            System.err.println("Invalid entry, try again");
            age = input.nextInt();
        }
        System.out.println("are you US citizen? yes/no");
        String eligibility = input.next().toLowerCase();

        while (!(eligibility.equals("yes") || eligibility.equals("no"))) {
            System.err.println(" Not valid entry, please try again");
            System.out.println("are you US citizen?");
            eligibility = input.next().toLowerCase();
        }
        if ( age > 21 ) {
            System.out.println(" you are eligible to vote");
        } else {
            System.out.println("you are not eligible to vote");*/
        }
    }
}
