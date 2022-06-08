package day11_Stringpart2;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        String correctUserName = "Cydeo",CorrectPassword = " WoodenSpoon";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your User name");
        String userNane = input.nextLine();
        System.out.println("Enter your password");
        String password =input.nextLine();

        input.close();

        if ( userNane.equals(correctUserName) && password.equals(CorrectPassword)){
            System.out.println("you are now logged in");
        }else
            System.err.println("Incorrect username or password, try again");

    }
}
