package day37_exceptions;

import day35_polymorphism.Task.Car;

public class MultiCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Program started");
        Car car=null;
        try{
            car.drive();
        }catch (ArithmeticException e){
            System.out.println("first catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Second catch block");
            e.printStackTrace();

        }catch (NullPointerException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("fourth catch block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("fifth catch block");
            e.printStackTrace();
        }
        System.out.println("program1 ended");
    }
}
