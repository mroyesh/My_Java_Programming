package day09_Scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        //byte num1 =input.nextByte();
        byte num =input.nextByte();
        System.out.println("enter your second number");
        short num1 =input.nextShort();
        System.out.println("enter your third number");
        int num2 = input.nextInt();
        System.out.println("enter your forth number ");
        long num3 = input.nextLong();
        input.close();// scanner closed can not put any input again
        System.out.println("enter your fifth number");
        int num4= input.nextInt();


        System.out.println("your first number is: "+num);
        System.out.println("your second number is: "+num1);
        System.out.println("Your third number is: "+num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);


    }
}
