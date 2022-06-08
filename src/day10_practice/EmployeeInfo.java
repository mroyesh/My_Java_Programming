package day10_practice;

import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter your full_name");
        String fullName= input.nextLine();

        System.out.println("Enter your age");
        byte age =input.nextByte();

        System.out.println("Enter your company name ");
        String companyName= input.nextLine();

        System.out.println("Enter your job title");
        String jobTitle=input.nextLine();

        System.out.println("Enter your salary");
        double salary = input.nextDouble();
        input.close();





    }
}
