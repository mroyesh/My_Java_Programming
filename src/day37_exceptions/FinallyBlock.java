package day37_exceptions;

public class FinallyBlock {
    public static void main(String[] args) {
        try{
            System.out.println(9/0);
        }catch (RuntimeException e){
            System.out.println("Runtime Exception has been caught");
            e.printStackTrace();
        }finally {
            System.out.println("finally Block");
        }

        System.out.println("--------------------------------------");


        try{
            System.out.println(9/0);
        }catch (NullPointerException e){
            System.out.println("Null pointer has been caught");
            e.printStackTrace();
        }finally {
            System.out.println("finally Block");
        }
    }
}
