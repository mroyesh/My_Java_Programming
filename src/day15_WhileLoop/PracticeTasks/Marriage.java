package day15_WhileLoop.PracticeTasks;

import java.util.Locale;
import java.util.Scanner;

public class Marriage {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("will you marry me?");
        String YesOrNo= input.nextLine().toLowerCase();
        while ( ! (YesOrNo.equals("yes")|| YesOrNo.equals("no"))) {
            System.err.println("invalid, please re-enter");
            System.out.println("will you marry me?");
            YesOrNo = input.nextLine().toLowerCase();
        }
        if(YesOrNo.equals("yes")){
            System.out.println("congregate");
        }else{
            System.out.println("Goodbye");
        }


        /*Scanner input= new Scanner(System.in);
        System.out.println("Will you marry me?");
        String yesOrno= input.next().toLowerCase();
        while ( !(yesOrno.equals("yes")||yesOrno.equals("no"))){
            System.err.println("Wrong answer, please try again");
            System.out.println("Will you marry me?");
            yesOrno= input.next().toLowerCase();
        }
        if(yesOrno.equals("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Goodbye");
            input.close();
        }*/



    }
}
