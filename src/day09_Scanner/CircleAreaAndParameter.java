package day09_Scanner;

import java.util.Scanner;

public class CircleAreaAndParameter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius");
        int radius = input.nextInt();
        System.out.println(" area of the circle is: " + radius * radius * Math.PI);
        System.out.println("the parameter of Circle is: " + 2 * radius * Math.PI);


    }
}
