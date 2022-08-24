package day37_exceptions;

public class TryCatchBlock {
    public static void main(String[] args) {

        System.out.println("Program1 started");
        try {
            System.out.println(9 / 0);
            System.out.println("try block");
        } catch (ArithmeticException e) {
            System.out.println("Catch block");
        }
        System.out.println("program1 ended");

        System.out.println("----------------------------");

        System.out.println("Program 2 started");
        String str = null;
        try {
            System.out.println(str.toUpperCase());
            System.out.println("Try block");
        } catch (RuntimeException e) {
            System.out.println("catch block");
        }
        System.out.println("Program 2 ended");


        System.out.println("-----------------------");

        System.out.println("block 3 started");

        try {
            Thread.sleep(3000);
            System.out.println("try block");
        } catch (InterruptedException e) {
            System.out.println("catch block");
        }
        System.out.println("Program 3 finished");
    }
}
