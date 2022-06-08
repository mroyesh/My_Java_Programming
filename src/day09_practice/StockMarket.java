package day09_practice;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of shares and price ");
        int shares = input.nextInt();
        double price= input.nextDouble();
        if ( shares >= 2000 && price > 2000 ) {
            System.out.println(" good investment");
        }else{
            System.out.println("Pk, investment");
        }


    }
}
