package day12_CustomMethods;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String first= input.nextLine().trim().replace(" ","");

        System.out.println("Enter your first name");
        String last = input.nextLine().trim().replace(" ","");

        input.close();

        // these trim and replace we use to remove any extra spaces and
        //String first= "cyDEO";  // this is another method to change it
        //String last ="SCHOOL";
        first = first.substring(0, 1).toUpperCase()+first.substring(1).toLowerCase();
        // getting first character of the first name + the remaining characters

        last= last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
        System.out.println(first + " "+last);




    }





    /*Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

    input:
    firstName = "cyDEo"
    lastName = "SCHOOL";

    output:
    Cydeo School*/
}
