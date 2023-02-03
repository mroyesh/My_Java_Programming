package day09_Scanner.Practice;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount in Cents");
        int amount = input.nextInt();
        int dollars = amount / 100;
        int Cents = amount % 100;
        System.out.println(amount + " Cent equals to " + dollars + " dollars and " + Cents+ " cents");



    }

}
