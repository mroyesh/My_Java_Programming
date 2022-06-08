package day09_Scanner;

import java.util.Scanner;

public class OddAndEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        if ( num % 2 == 0 ) {
            System.out.println("The number is even number");
            }else{
            System.out.println("The number is odd number");
        }
    }
}