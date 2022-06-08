package day09_practice;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the score");
        int input2=input.nextInt();
        String result="invalid score";
            if (input2 >= 0 && input2 <= 100 ) {
                result = (input2 >= 90) ? "A" : (input2 >= 80) ? "B"
                        : (input2 >= 70) ? "C" : (input2 >= 60) ? "D" : "F";
            }else {
                result="Invalid score";
            }
        System.out.println("Your score is= "+result);




    }
}
