package day09_Scanner;

import java.util.Scanner;

public class FamilySize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int familySize = 9;
        String num = "";
        System.out.println("Enter your family size");
        if ( familySize <= 3 ) {
            System.out.println("Live with less than 3 people");
        } else if ( familySize >= 4 && familySize <= 6 ) {
            System.out.println("Live with 3-6 people");
        } else
            System.out.println("Live with more than 6 people");
    }
}