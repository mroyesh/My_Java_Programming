package day09_Scanner;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter day number");
        int day = input.nextInt();
        if ( day > 1 && day <= 7 ) {
            if ( day == 1 ) {
                System.out.println("Monday");
            } else if ( day == 2 ) {
                System.out.println("Tuesday");
            } else if ( day == 3 ) {
                System.out.println("Wed");
            } else if ( day == 4 ) {
                System.out.println("Thursday");
            } else if ( day == 5 ) {
                System.out.println("Fri");
            } else if ( day == 6 ) {
                System.out.println("Sat");
            } else {
                System.out.println("Sun");
            }
        } else {
            System.out.println("Invalid");
        }

    }
}
