package Lab05_Recap;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Would you like to continue? yes/no");
        String a =input.nextLine().toLowerCase();
        while(!(a.equals("yes")||a.equals("no"))){
            System.err.println("Invalid entry, would you like to continue?");
            a =input.nextLine().toLowerCase();
        }
    }
}
