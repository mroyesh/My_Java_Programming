package day37_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock2 {
    public static void main(String[] args) {
        System.out.println("Program started");

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        try {
            System.out.println(arr[1000]);
        } catch (RuntimeException e) {
            e.printStackTrace();// display full details of exception after the excution of program
        }
        System.out.println(" Program 1 ended");

        System.out.println("-----------------------------------------");
        try {
            FileInputStream file = new FileInputStream("file path");
        } catch (FileNotFoundException e) {





     /*   try {
            Thread.sleep(3000);
        } catch (InterruptedException a) {
            throw new RuntimeException(e);
            a.printStackTrace();
        }*/
        }
    }
}
