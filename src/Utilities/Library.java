package Utilities;

public class Library {
    public static void sleep(double second)  {
        try {
            Thread.sleep((long) second * 1000l);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
