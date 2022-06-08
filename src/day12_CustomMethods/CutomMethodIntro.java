package day12_CustomMethods;

public class CutomMethodIntro {
    public static void main(String[] args){
        System.out.println("Test started");

        displayMessage();

        greetings();


        System.out.println("Test completed");

        System.out.println("_____------------__________------");
        // we can create as many method is we want and anywhere outside of main/ independent
    }
    public static void greetings(){
        System.out.println("Hello Cydeo");
        System.out.println("How are you today?");
        System.out.println("Are you ready to learn Java?");
    }

    public static void displayMessage(){
        System.out.println("Hello World");
        System.out.println("I love Java");
    }
}
