package day10_String;

import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String employeeName=input.nextLine();
        System.out.println("Enter your age");
        int employeeAge= input.nextInt();
        input.nextLine();
        System.out.println("Enter your gender");
        char employeesGender= input.next().charAt(0);
        System.out.println("Enter your company");
        String CompanyName= input.nextLine();
        System.out.println("Enter your job title");
        String jobTitle=input.nextLine();
        System.out.println();
        System.out.println("Enter your salary");
        String salary =input.nextLine();
        System.out.println(employeeName+"\n"+employeeAge+"\n"+employeesGender+"\n"
        +CompanyName+"\n"+jobTitle+"\n"+salary);


    }
}
