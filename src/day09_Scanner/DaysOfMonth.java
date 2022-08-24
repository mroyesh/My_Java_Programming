package day09_Scanner;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter the number of  month");
        int numberOfMonth = input.nextInt();
        String month="";
        switch (numberOfMonth){
            case 1:
                month ="Jan";
                break;
            case 2:
                month ="Feb";
                break;
            case 3:
                month = "Mar";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month ="May";
                break;
            case 6:
                month ="June";
                break;
            case 7:
                month= "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month= "Sep";
                break;
            case  10:
                month = "Oct";
                break;
            case 11:
                month ="Nov";
                break;
            case 12:
                month= "Dec";
                break;
            default:
                month= "Invalid Month";
        }
        System.out.println(month);
    }
}
