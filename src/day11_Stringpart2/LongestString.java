package day11_Stringpart2;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first strings");
        String first = input.nextLine();
        System.out.println("enter your second string");
        String second = input.nextLine();

        input.close();
        if( first.length() > second.length()){
            System.out.println("First string is longest");
        }else{
            System.err.println("second is longer");






        /*1. Create a class named LongestString
        1.1 Ask the user to enter two strings
        1.2 Write a program that can print the longest string,
        if both have the same number of characters then print "Equal"*/

        }
    }
}
