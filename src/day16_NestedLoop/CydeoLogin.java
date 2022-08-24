package day16_NestedLoop;

import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter user name");
        String user = input.next();

        System.out.println("enter your password");
        String pass = input.next();

        if ( user.equals("Cydeo") && pass.equals("WoodenSpoon") ) {
            System.out.println("logged in");
        } else {
            for (int i = 0; i < 3; i++) {
                if ( i != 2 ) {
                    System.err.println("Invalid password, try again");
                } else {
                    System.out.println("This is your last attempt, ");

                    System.err.println("incorrect User name or password");
                    System.out.println("Enter your user name");
                    user = input.next();
                    System.out.println("enter your password");
                    pass = input.next();

                    if ( user.equals("Cydeo") && pass.equals("WoodenSpoon") ) {// if the user enter valid cridintial
                        System.out.println("logged in");
                        break; // exit loop
                    }
                }
                if ( !(user.equals("Cydeo") && pass.equals("WoodenSpoon")) ) {
                    System.err.println("your account is locked, call support");
                }
            }
            input.close();
        }
    }
}
