package day13_CustomMethods;

import java.util.Scanner;

public class ReturnStatementPractice {
    public static void main(String[] args) {
        System.out.println("enter the grade");
        char grade = new Scanner(System.in).next().charAt(0);

        boolean isInvalid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D'
                || grade == 'F';
        if ( !isInvalid ) {
            System.err.println("Invalid grade");
            return;
        }
        System.out.println((grade == 'A') ? "Excellent" : (grade == 'B') ? "great job"
                : (grade == 'C') ? "Good" : (grade == 'D') ? "Passed" : "Failed");
    }
}
