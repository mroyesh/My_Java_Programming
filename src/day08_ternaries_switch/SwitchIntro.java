package day08_ternaries_switch;

public class SwitchIntro {
    public static void main(String[] args) {
        char grade = 'P';

        /*
        A: excellent
        B: Great job
        C: good
        D: passed
        F: Failed*/
        System.out.println("--------------");
        switch(grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println(" Great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("passed");
                break;
            case  'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid ");
        }
        int rooms=9;
        switch (rooms){
            case 1:
                System.out.println("Small");
                break;
            case 2:
                System.out.println("medium");
                break;
            case 3:
                System.out.println("big");
                break;
            case 4:
                System.out.println("large");
                break;
            case 5:
                System.out.println("huge");
                break;
            default:
                System.out.println("Not valid rooms");

        }

    }
}
