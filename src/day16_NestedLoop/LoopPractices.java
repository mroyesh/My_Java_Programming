package day16_NestedLoop;

import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your score");
        int score= input.nextInt();
        while (score<0 ||score>100){
            System.out.println("Invalid entry, try again");
            score=input.nextInt();
        }
        if(score>60){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
    }
}
