package day09_Scanner;

import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String full_name =input.nextLine();

        System.out.println("Enter School name");
        String school_name = input.nextLine();

        System.out.println("Enter your gender");
        String gender = input.next();

        System.out.println("Enter your age");
        int age =input.nextInt();
        input.nextLine();


        System.out.println("Enter your address");
        String address = input.nextLine();





        System.out.println("Your full name is: "+full_name);
        System.out.println("your school name is: "+school_name);

    }
}
