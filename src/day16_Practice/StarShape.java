package day16_Practice;

import day14_forLoop.ForLoopIntro;

import java.util.Scanner;

public class StarShape {
    public static void main(String[] args) {

        String star = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= 1; j++) {
                star += " *";
                System.out.println(star);
               // System.out.println();
            }
        }

       /* for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <8 ; j++) {
                System.out.println(" *");


        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(" "+j * i);

            }
            System.out.println();
        }

        for (char i = 'A'; i <='E' ; i++) {
            for (char j = 'a'; j <='y' ; j++) {
                System.out.print(" "+i+""+j+"");
            }
            System.out.println();

        }*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int radius= input.nextInt();
        while (!(radius>=0)){
            System.err.println("Invalid entry for the radius of the circle ");
            return;
        }
        if(radius>0){

            System.out.println("Diameter of the circle: =  "+2*radius );
            System.out.println("Area of the circle: = "+radius*radius*Math.PI);
            System.out.println("Perimeter of the circle : = "+2*radius*Math.PI);
            System.out.println("Would you like to calculate another circle? (yes or no)");
            String yesOrNo=input.next().toLowerCase();
        while ( ! (yesOrNo.equals("yes")|| yesOrNo.equals("no"))) {
            System.err.println("invalid, please re-enter");
            yesOrNo=input.next().toLowerCase();
        }
        if(yesOrNo.equals("yes")){
            System.out.println("Enter radius of circle");
            radius=input.nextInt();
            System.out.println("Diameter of the circle: = "+radius*radius*Math.PI);
            System.out.println("Diameter is: = "+radius);
            System.out.println("Perimeter of the circle : = "+2*radius*Math.PI);

        }else{
            System.out.println("Thank you for using Cydeo Circle Calculation APP");
            }

        }
    }
}