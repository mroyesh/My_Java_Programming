package day22_arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task1Solutions {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(replace(array, 2, 35)));

        System.out.println("------------------------------");

        double[] d1 = {2.5, 3.5, 4.5, 6.5, 7.5, 8.5, 9.5};
        System.out.println(Arrays.toString(replace(d1, 0,0)));

        System.out.println("---------------------------------");

        char[] ch= {'F', 'B', 'C','D','E', 'F'};
            System.out.println(Arrays.toString(replace(ch, 0, 'A')));

        System.out.println("-----------------------------------");


        String[] str={ "I","hate", "Java"};

        System.out.println(Arrays.toString(replace(str,1,"love")));
        }




    public static int[] replace(int[] array, int index, int newElement) {
        for (int i = 0; i < array.length; i++) {
            if ( i == index ) {
                array[i] = newElement;
            }

        }
        return array;
    }

    public static double[] replace(double[] array, int index, double newElement) {
        for (int i = 0; i < array.length; i++) {
            if ( i == index ) {
                array[i] = newElement;
            }

        }
        return array;
    }

    public static char[] replace(char[] array, int index, char newElement) {
        for (int i = 0; i < array.length; i++) {
            if ( i == index ) {
                array[i] = newElement;
            }
        }
        return array;
    }

    private static String[] replace(String[] array, int index, String newElement) {
        for (int i = 0; i < array.length; i++) {
            if ( i == index ) {
                array[i] = newElement;
            }

        }
        return array;
    }
}
