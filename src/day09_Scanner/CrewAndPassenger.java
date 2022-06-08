package day09_Scanner;

public class CrewAndPassenger {
    public static void main(String[] args) {

        int numOfPeople= 50;
        String result= (numOfPeople==50||numOfPeople==75||numOfPeople==100)?
                (numOfPeople==50)?"20 crew and 30 passenger": (numOfPeople==75)?
                        " 25 crew and 50 passenger":"30 crew and 70 passenger"
                :"Invalid ";
        System.out.println(result);

        int pasAndCrew=90;
         String result1="";
        switch (numOfPeople){
            case 50:
                System.out.println("20 crew and 30 pass");
                break;
            case 75:
                System.out.println("25 crew and 50 pass ");
                break;
            case 100:
                System.out.println("30 crew and 70 pass");
                break;
            default:
                System.out.println("Invalid number");

        }

    }

}
