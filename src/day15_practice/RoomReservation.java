package day15_practice;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to reserve a room");
        String YesOrNo= input.nextLine().toLowerCase();
        while ( ! (YesOrNo.equals("yes") || YesOrNo.equals("no"))){
            System.err.println("Sorry invalid entry, try again");
            YesOrNo=input.nextLine().toLowerCase();
            if(YesOrNo.equals("no")){
                System.out.println("have a nice day");
            }
            if(YesOrNo.equals("yes")){
                System.out.println("chose your room size");
                String room= input.nextLine();
                while (room=="King bed"|| room== "Queen Bed");
            }
        }

    }


}
