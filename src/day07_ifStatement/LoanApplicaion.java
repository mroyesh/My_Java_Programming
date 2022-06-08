package day07_ifStatement;

public class LoanApplicaion {
    public static void main(String[] args) {
        int salary = 55000,
                creditScore = 680;
        if(salary >= 45000 && creditScore >=700){
            System.out.println("You are eligible for loan");
        }else{
            System.out.println("you are not eligible for loan");
        }

    }
}
