package day16_NestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Enter the number");
            int number = input.nextInt();
            if ( number % 2 == 0 ) {
                System.out.println("The numbe is even number");
            } else {
                System.out.println("the number is Odd");
            }
            System.out.println("would you like to continue? yes or no");
            String yesNo = input.next().toLowerCase();

            while (!(yesNo.equals("yes")||yesNo.equals("no"))) {
                System.err.println("Invalid entry, try again");
                yesNo=input.next();
            }
            if(yesNo.equals("no")){
                break;
            }

        }




    }
}
