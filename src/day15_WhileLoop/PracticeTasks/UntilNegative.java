package day15_WhileLoop.PracticeTasks;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number");
        int number= input.nextInt();
        while (number>0){
            number+=sum;
            number=input.nextInt();
        }
        System.out.println(sum);
        }

    }

