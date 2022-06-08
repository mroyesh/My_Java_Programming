package day12_Tests;

import java.sql.SQLOutput;

public class LoanApproval {
    public static void main(String[] args) {

        LoanApprove(12000, 560);

    }
    public static void LoanApprove(double salary, double creditScore){
        if(salary>=60000 && creditScore>=760){
            System.out.println("you are eligible for loan");
        }else{
            System.out.println("you are not eligible for loan");
        }



    }
}
