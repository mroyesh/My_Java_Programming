package day06_IfStatement;

public class singleIfStatementPractice {
    public static void main(String[] args) {
        int a = 4;
        boolean isEven = a % 2==0;
        if ( isEven ) {
            System.out.println("Even number");
        }
        if ( !isEven ) {
            System.out.println("Is odd number");
        }

    }
}
