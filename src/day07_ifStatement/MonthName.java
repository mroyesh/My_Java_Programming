package day07_ifStatement;

public class MonthName {
    public static void main(String[] args) {
        int n1 = 1;
        String Month = "";
        if (n1 >= 1 && n1 <= 12) {
            if (n1 == 1){
                System.out.println("January");
            } else if (n1 == 2){
                System.out.println("Feb ");
            } else if (n1 == 3) {
                System.out.println("March");
            } else if (n1 == 4) {
                System.out.println("April");
            }else if (n1 == 5){
                System.out.println("may");
            }else if (n1 ==6){
                System.out.println("June");
            }else if (n1 ==7){
                System.out.println("July");
            }else if (n1 ==8){
                System.out.println("August");
            }else if (n1 ==9){
                System.out.println("September");
            }else if (n1 ==10){
                System.out.println("October");
            }else if (n1 ==11){
                System.out.println("November");
            }else if (n1 ==12){
                System.out.println("December");
            }
            } else {
                System.out.println("Invalid month");
            }
        }
    }