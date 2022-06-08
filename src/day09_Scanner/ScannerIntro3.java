package day09_Scanner;

import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter a charactor");
        char ch=input.next().charAt(0);

        System.out.println("you have answerd: " +ch);
        input.nextLine();

        System.out.println("Would you like to continue?");
        String answer=input.nextLine();

        System.out.println("you entered "+answer);
;
    }
}
