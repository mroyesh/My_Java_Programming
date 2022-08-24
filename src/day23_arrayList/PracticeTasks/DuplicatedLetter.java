package day23_arrayList.PracticeTasks;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicatedLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = input.next();
        System.out.println(findDup(str));
    }

    public static String findDup(String str) {
        String[] ch = str.split("");//compare each
        String newString = "";
        for (String each : ch) {
            int counter = 0;

            for (String result : ch) {
                if ( result.equalsIgnoreCase(each) ) {
                    counter++;
                }

            }
            if ( counter > 1 && ! (newString.toLowerCase().contains(each.toLowerCase())) ) {
                newString += each;
            }
        }
        System.out.println("number of newString = " + newString.length());
        return newString;

    }
}
