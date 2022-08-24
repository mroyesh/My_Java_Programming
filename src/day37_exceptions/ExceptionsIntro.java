package day37_exceptions;

import java.io.FileInputStream;

public class ExceptionsIntro {
    public static void main(String[] args) {


        String str = "Java";
        char ch= str.charAt(250);//  unchecked exception

        System.out.println(ch);


        Pizza pizza = null;// unchecked exception
        pizza.calcCost();

        System.out.println(50/0);

        System.out.println("----------------------------");

        int score= 100;
        if(score> 59){
            System.out.println(" your grade is D");
        }else if(score > 70){
            System.out.println("Your score is C");
        }

        //FileInputStream file= new FileInputStream("name"); // checked exception


        //Thread.sleep(3000);//checked exception
    }
}

