package day06_IfStatement;

public class ifStatementIntro {
    public static void main(String[] args) {
        int num1 = 500;
        boolean isPositive = num1 > 0;
        if (isPositive) {
            System.out.println(num1 + " is positive number");
        }
        boolean isNegative = num1 < 0;
        if (isNegative) {
            System.out.println(num1 + " is negative number");
        }
        boolean isZero = num1 == 0;
        if (isZero) {
            System.out.println(num1 + " is zero");
        }
        System.out.println("---------------------------");
        int num2 =0;
        if(num2 >0){
            System.out.println( num2 + " is positive number");
            if (num2<0){
                System.out.println(num2 + " is negative number");
            }
            if (num2 == 0){
                System.out.println(num2 + " is zero");
            }
        }
    }
}