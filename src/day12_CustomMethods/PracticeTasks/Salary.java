package day12_CustomMethods.PracticeTasks;

public class Salary {
    public static void main(String[] args) {
        salaryCal(16.5, 40);

    }
    private static void salaryCal(double hourly, int hoursPerweek){
        System.out.println("You make $"+hourly+" per hour");
        System.out.println("You work "+hoursPerweek+" per week");
        System.out.println("Your gross income is: $"+hourly*hoursPerweek+" per week" );


    }
}
