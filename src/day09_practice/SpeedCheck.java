package day09_practice;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int speedLimit= 75;
        System.out.println("enter speed");
        int speed= input.nextInt();
        if(speed>=speedLimit){
            System.out.println("your speed is "+ (speed-speedLimit) +" over speed, slow down.");
        }





        int speedLimit1 = 65;
        System.out.println("enter your speed");
        int speed1 = input.nextInt();
        String num = (speedLimit1<=65)? "You are driving "+(speed1-speedLimit1)+" mph over the speed limit. Slow down":"";
        System.out.println(num);


    }
}