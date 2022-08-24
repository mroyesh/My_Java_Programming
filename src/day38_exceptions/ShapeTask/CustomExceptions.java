package day38_exceptions.ShapeTask;

//import day38_exceptions.customUncheckedException;

public class CustomExceptions {

    public static void main(String[] args) {

        try {
            throw new customCheckedException();
        } catch (customCheckedException e) {
            e.printStackTrace();
        }

        System.out.println("---------------------------------------");

        //throw new customUncheckedException();


    }


}
