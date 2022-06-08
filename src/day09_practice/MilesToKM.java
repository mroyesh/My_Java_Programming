package day09_practice;

import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the distance");
        int distance = input.nextInt();
        double miles =1.60934;
        double km=0.621371;
        System.out.println(miles*distance );

    }
}
