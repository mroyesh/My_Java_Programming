package day16_NestedLoop;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition = false;

        for (; condition; ) {
            System.out.println("Hello");
        }
        System.out.println("------------------------");

        while (condition) {
            System.out.println("hello");

            System.out.println("*******************");
        }
        do {
            System.out.println("Hello bunny");
        } while (condition);


        System.out.println("*********************");

        Scanner input = new Scanner(System.in);

        String u, p;
        int attempt = 3;
        do {
            System.out.println("Enter the username");
            u = input.next();
            System.out.println("Enter password");
            p = input.next();
            attempt--;
            if ( attempt == 0 ) {
                System.err.println("your account is locked");
                break;
            }
        } while (!(u.equals("Cydeo") && p.equals("WoodenSpoon")));
    }
}