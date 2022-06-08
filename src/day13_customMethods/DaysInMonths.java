package day13_customMethods;

import java.util.Scanner;

public class DaysInMonths {
    public static void main(String[] args) {
        System.out.println("Enter the month number");
        int month = new Scanner(System.in).nextInt();
        if ( month < 1 || month > 12 ) {
            System.out.println("not valid month, try again");
        } else {
            switch (month) {
                case 2:
                    System.out.println("has 28 days");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("has 30 days");
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("has 31 days");
            }

        /*int month = new Scanner(System.in).nextInt();
        if(month<1|| month>12){
            System.err.println("Invalid month");
            return;
        }
        switch (month){
            case 2:
                System.out.println("has 28 days");
                return;
            case 4: case 6: case 9: case 11:
                System.out.println("has 30 days");
                break;
            default:
                System.out.println("has 31 days");*/
        }
    }
}


