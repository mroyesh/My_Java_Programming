package day06_IfStatement;

public class IfStatement {
    public static void main(String[] args) {
        /*int score = 75;
        if(score >= 60){
            System.out.println("Congratulation of passing your exam");
        }
        double salary = 98000;
        if(salary > 8000){
            System.out.println("You can apply for $600,000 loan");
        }*/
        int creditScore = 729;
        String job = "full time";
        double salary = 98000;
        if( creditScore >= 730 && salary >= 6000){
            System.out.println(" is eligible for loan");
        }else{
            System.out.println(" is not eligible for loan");
        }
    }
}
