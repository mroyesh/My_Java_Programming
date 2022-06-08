package day06_IfStatement;

public class singleIfStatementPractice {
    public static void main(String[] args) {
        int a = 0;
        boolean isEven = true;
        if ( isEven ) {
            System.out.println("Even number");
        }
        if ( !isEven ) {
            System.out.println(" is Odd number");
        }
        if ( !isEven && !isEven ) {
            System.out.println("Is zero");
        }

    }
}
