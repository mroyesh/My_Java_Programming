package day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice {
    public static void main(String[] args) {

        int a= 0;
        for (int i = 1; i <= 10; i++) {
            a+=i;
        }
        System.out.println(a);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(" " + sum);

        int sum2 = 0;
         for(int i = 1; i <=20; i++) {
             sum2 += i;

        }
        System.out.println(sum2);

        System.out.println("sum2 = " + sum2);

        for (char i = 'A'; i <= 'Z'; i++) {
            if ( i == 'X' || i == 'Y' || i == 'Z' ) {
                continue;
            }
            System.out.print(" " + i);
        }

        for (char i = 'Z'; i >= 'A'; i--) {
            if ( i == 'P' ) {
                continue;
            }
            System.out.print(" " + i);

        }

    }
}

