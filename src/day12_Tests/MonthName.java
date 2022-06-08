package day12_Tests;

public class MonthName {
    public static void main(String[] args) {

        monthName(990);

    }
    private static void monthName(int month){
        switch (month){
            case 1:
                System.out.println("January");
                return;
            case 2:
                System.out.println("February");
                return;
            case 3:
                System.out.println("march");
                return;
            case 4:
                System.out.println("April");
                return;
            case 5:
                System.out.println("May");
                return;
            case 6:
                System.out.println("June");
                return;
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
                return;
            case 9:
                System.out.println("September");
                return;
            case 10:
                System.out.println("October");
                return;
            case 11:
                System.out.println("November");
                return;
            case 12:
                System.out.println("December");
                return;
            default:
                System.out.println("not valid entry");

        }
    }

}
