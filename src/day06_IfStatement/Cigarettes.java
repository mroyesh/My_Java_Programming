package day06_IfStatement;

public class Cigarettes {
    public static void main(String[] args) {

        int age= 17;
        if(age > 21) {
            System.out.println(" you can buy cigarette");
        }
        if( age <21 && age<100){
            System.err.println("Sorry, you are not eligible to buy cigarette");
        /*int age = 102;
        if(age >=21 && age <100){
            System.out.println("You are eligible to buy Cigarette");
        }
        if ( age > 100 || age <21){
            System.err.println("you are not eligible to buy cigarette");
        }
        //int age = 6;
       // boolean eligibleToBuyCigarette = age >=18;
      //  if (age <= 18) {
        //    System.out.println("You are not eligible to buy Cigarette"); */
        }


    }
}