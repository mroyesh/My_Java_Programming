package day15_WhileLoop;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the age");
        int age= input.nextInt();
        while (!(age>1 && age<120)){
            System.err.println("Invalid number, please try again");
            age= input.nextInt();
        }
        if(age>21){
            System.out.println("you are eligible to vote");
        }else{
            System.out.println("you are not eligible to vote");
        }
        input.close();


    }
}
