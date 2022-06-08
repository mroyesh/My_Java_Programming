package day15_practice;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class FrequesncyOfChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str1 = input.nextLine();
        System.out.println("enter the char");
        char ch = input.next().charAt(0);
        int result1 = 0;
        for (int i = 0; i < str1.length() - 1; i++) {
            if ( str1.charAt(i) == ch ) {
                result1 += 1;
            }
        }

    }
}


