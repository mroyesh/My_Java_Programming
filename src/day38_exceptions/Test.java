package day38_exceptions;

import Utilities.Library;

import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello cydeo");
        //Thread.sleep(3500);

       /* try {
            Library.sleep(3.5);
        } catch (InterruptedException e) {
            System.out.println("How are you today");
        }*/


        System.out.println("=====================================================");


        if( LocalTime.now().equals(LocalTime.of(4, 0)) ){
            throw  new BreakTimeException();
        }
            throw new BreakTimeException("Is is time to go home");
    }
}
