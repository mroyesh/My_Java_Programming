package day12_Tests;

import java.util.Locale;
import java.util.Scanner;

public class daysOfTheMonth {
    public static void main(String[] args) {
        daysOfTheMonths("monday");

    }
    private static void daysOfTheMonths(String month) {
        month = month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase();
            switch (month){
                case "January":
                    System.out.println(month+ " has 31 days");
                    break;
                case "February":
                    System.out.println(month+ "Has 28 days");
                    break;
                case "March":
                    System.out.println(month+"has 31 days");
                    break;
                case "April":
                    System.out.println(month+" has 30 days");
                    break;
                case "May":
                    System.out.println(month+" has 31 days");
                    break;
                case "June":
                    System.out.println(month+ " has 30 days");
                    break;
                case "July":
                    System.out.println(month+ " has 31 days");
                    break;
                case "August":
                    System.out.println(month+ " has 31 days");
                    break;
                case "September:":
                    System.out.println(month+ " Has 30 days");
                    break;
                case "October":
                    System.out.println(month+ " has 31 days");
                    break;
                case "November":
                    System.out.println(month+ "Has 30 days");
                    break;
                case "December":
                    System.out.println(month+ " has 31 days");
                    break;
                default:
                    System.out.println("not a valid month");
            }

        }

        }


