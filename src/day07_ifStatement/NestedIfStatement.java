package day07_ifStatement;

public class NestedIfStatement {
    public static void main(String[] args) {
        int score = -88;
        if ( score >= 0 && score <= 100 ) {
            if ( score > 60 ) {
                System.out.println("Passed");
            } else {
                System.out.println("failed");
              }
             }else{
            System.out.println(" Not valid score");
        }
    }
}