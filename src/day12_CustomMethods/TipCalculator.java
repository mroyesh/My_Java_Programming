package day12_CustomMethods;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Split or no split? (yes or no)");
        String yesOrNo= input.nextLine().toLowerCase();

        System.out.println("Enter number of people");
        int NumOfPeople = input.nextInt();;

        System.out.println("enter check amount");
        int amount = input.nextInt();

        System.out.println("how is our service quality?(excellent,great, good,fair, poor )");
        String service= input.nextLine().toLowerCase();
        input.close();

        double totalTips=(service.equals("excellent"))? amount*0.25
                :(service.equals("great"))?amount*0.2
                :(service.equals("good"))?amount*0.15
                :(service.equals("fair"))?amount*0.1
                :amount*0.05;
        double tootalTopay=NumOfPeople*(amount+totalTips);
        if(yesOrNo.equals("yes")){
            System.out.println(tootalTopay / NumOfPeople);
        }
        System.out.println("total to pay:= $"+tootalTopay);
        System.out.println("number of people:= " +NumOfPeople);









    }
}
