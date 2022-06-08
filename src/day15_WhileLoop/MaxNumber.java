package day15_WhileLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        int max= -2147483648;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the number");
            int num= input.nextInt();
            if(num>max){
                max=num;
            }
        }
        System.out.println("max = " + max);

        int max=-2147483648;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the number");
            int number=input.nextInt();
            if(number>max){
                max=number;
            }
        }
        System.out.println("max number is= "+max);

        int min= 2134748345;
        for (int i = 0; i < 5; i++){
            System.out.println("Enter the number");
            int num1=input.nextInt();
            if(num1<min){
                min=num1;
            }
        }
        System.out.println(" min number is = "+ min);*/
        Scanner input=new Scanner(System.in);
        int min =2132324566;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter the number");
            int num= input.nextInt();
            if(num<min){
                min = num;
            }
        }
        System.out.println("min = " + min);



    }
}