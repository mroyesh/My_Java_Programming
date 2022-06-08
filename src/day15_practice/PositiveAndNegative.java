package day15_practice;

import java.util.Scanner;

public class PositiveAndNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int num = 0;


        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the number");
            num = input.nextInt();
            if ( num > 0 ) {
                num = 1;
                positive += num;
                continue;
            } else {
                num = 1;
                negative += num;
                continue;
            }
            }
            System.out.println("positive is =" + positive);
            System.out.println("negative is =" + negative);


        }
    }


