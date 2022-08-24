package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Tests {


    /*public static int[] replace(int[] arr, int index, int newElement) {
        if ( index < 0 || index > arr.length - 1 ) {
            System.err.println("invalid index " + index);
            System.exit(0);
        }
        arr[index] = newElement;
        return arr;
    }

    public static double[] replace(double[] arr, int index, double newElement) {
        if ( index < 0 || index > arr.length - 1 ) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }
        arr[index] = newElement;
        return arr;
    }

    public static char[] replace(char[] arr, int index, char newElement) {
        if ( index < 0 || index > arr.length - 1 ) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }
        arr[index]= newElement;
        return arr;

    }
    public static String[] replace(String[] arr, int index, String newElement){
        if(index<0|| index>arr.length-1){
            System.err.println("Invalid index "+ index);
            System.exit(0);
        }
        arr[index]= newElement;
        return arr;
    }*/

    /*public static int[] replaceAll(int[] array, int oldElement, int newElement){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldElement){
                array[i]=newElement;
            }
        }
        return array;
    }
    public static double[] replaceAll(double[] array, double oldElement, double newElement){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldElement){
                array[i]=newElement;
            }

        }
        return array;
    }
    public static char[] replaceAll(char[] array, char oldElement, char newElement){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldElement){
                array[i]=newElement;
            }

        }
        return array;
    }
    public static String[] replaceAll(String[] array, String oldElement, String newElement){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldElement){
                array[i]=newElement;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] arr={"names", " names1", "Names2","names"};

     */

    public static int[] insert(int[] array, int index, int element) {
        int[] result = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if ( i == index ) {
                result[i] = element;
                result[i + 1] = array[i];
            } else {
                result[i] = array[i];
            }

        }
        return result;
    }
}



    /*
    Insert Task:
        1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element. the method inserts the given element to the given index of the array and returns the new array
                Ex:
                    arr = {10, 20, 30, 40, 50};

                    insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


        1.2 Create the same function for double array, char array and string array

     */







