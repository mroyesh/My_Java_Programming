package day15_WhileLoop;

import java.util.Scanner;

public class MaxAndMinNumber {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int max=-2134455664;
        int min= 223343455;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter the number");
            int num = input.nextInt();
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }


}
