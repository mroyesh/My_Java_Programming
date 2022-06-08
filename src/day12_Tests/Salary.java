package day12_Tests;

public class Salary {
    public static void main(String[] args) {
        salaryCal(16.5, 40);

    }
    private static void salaryCal(double hourly, int hoursperweek){
        System.out.println("You make $"+hourly+" per hour");
        System.out.println("You work "+hoursperweek+" per week");
        System.out.println("Your gross income is: $"+hourly*hoursperweek+" per week" );


    }
}
