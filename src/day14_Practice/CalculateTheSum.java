package day14_Practice;

import java.util.Scanner;

public class CalculateTheSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the last number");
        int number= input.nextInt();
        int sum = 0;
        for (int i = 1; i <=number; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        int sum1=0;
        for (int i = 0; i <=10 ; i++) {
            sum1+=i;
        }
        System.out.println("the number is: "+sum1);

    }







        /*int result = 0;
        for (int i = 0; i < 5; i++) {
            result += i;

        }
        System.out.println(result);


        int sum1 = 0;
        for (int i = 0; i <= 50; i++) {
            sum1 += i;

        }
        /*System.out.println(sum1);

        for(int i =0)*/
        /*Scanner input =new Scanner(System.in);
        int min = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("Input your int number");
            int num = input.nextInt();
            if (i==0) min = num;
            else if (num<min) min=num;
        }
        System.out.println("max number is " + min);
        input.close();*/
}

