package day15_practice;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first positive number");
        int num1 = input.nextInt();
        System.out.println("Enter the second positive number");
        int num2 = input.nextInt();
        int result = 0;
        while (num1 > 0 && num2 > 0) {
            result += 1;
            num1 -= num2;
        }
        System.out.println(result);

    }
}
