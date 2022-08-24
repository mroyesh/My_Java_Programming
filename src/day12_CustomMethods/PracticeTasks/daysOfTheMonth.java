package day12_CustomMethods.PracticeTasks;

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
                case "May":
                case "July":
                case "August":
                case "October":
                case "December":
                    System.out.println(month+ " has 31 days");
                    break;
                case "February":
                    System.out.println(month+ "Has 28 days");
                    break;
                case "March":
                    System.out.println(month+"has 31 days");
                    break;
                case "April":
                case "June":
                    System.out.println(month+" has 30 days");
                    break;
                case "September:":
                    System.out.println(month+ " Has 30 days");
                    break;
                case "November":
                    System.out.println(month+ "Has 30 days");
                    break;
                default:
                    System.out.println("not a valid month");
            }
        }
    }


