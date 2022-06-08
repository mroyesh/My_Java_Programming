package day13_customMethods;

import java.util.Scanner;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        boolean result = isOdd(8);
        System.out.println(result);
        boolean result2 = isEven(34);
        System.out.println(result2);
         double salary =9000;
         int creditScore= -9;
         if(salary<0 || creditScore<=0){
             System.err.println("not valid entry");
             return;
         }
        if(salary>=90000&& creditScore>780){
            System.out.println("you are eligible for loan");
        }else {
            System.out.println("you are not eligible for loan");
        }
    }
    public static boolean isOdd(int num) {
        if ( num % 2 != 0 ) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isEven(int num) {
        return !isOdd(num);
    }
    public static int max(int num1, int num2) {
        //return num>num2? num:num2;
        if ( num1 > num2 ) {
            return num1;
        } else {
            return num2;
        }

    }
}