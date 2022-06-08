package day09_practice;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount in Cents");
        int amount = input.nextInt();
        int dollors = amount / 100;
        int Cents = amount % 100;
        System.out.println(amount + " is equal to " + dollors + " dollors and " + Cents+ " cents");
    }
}
