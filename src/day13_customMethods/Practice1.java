package day13_customMethods;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        if ( number < 1 || number > 7 ) {
            System.out.println("invalid number");
            return;
        } else {
            System.out.println((number == 1) ? "Monday"
                    : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday" :
                    (number == 4) ? "Thursday" : (number == 5) ? "Friday" : (number == 6) ?
                            "Saturday" : "Sunday");

            //grade1("A");// grade which has been called from grade1 method

        }
    }
    public static void grade1(String grade1) {
        char grade = new Scanner(System.in).next().charAt(0);
        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C'
                || grade == 'D' || grade == 'F';
        if ( !isValid ) {
            System.err.println("invalid entry");
            return;
        }
        System.out.println((grade == 'A') ? "Excellent"
                : (grade == 'B') ? "Great job" : (grade == 'C') ? "Good"
                : (grade == 'D') ? "Passed" : "Failed");
    }


    public static void daysOfTheWeek(int number) {

    }

}
