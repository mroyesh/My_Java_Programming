package Utilities;

import Lab08_SplitterApp.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {


        /*int[] a1 = {1, 2, 3, 4, 5, 6};
        int[] a2 = {7, 8, 9};
        int k = 0;
        int[] a3 = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++, k++) {
            a3[k] = a1[i];
        }
        for (int i = 0; i < a2.length; i++, k++) {
            a3[k] = a2[i];
        }
        System.out.println(Arrays.toString(a3));


        double [] b1= {1.0, 2.0, 3.0, 4.0,};
        double [] b2= {4.5, 5.5, 6.5, 7.5};
        double[]b3= ArraysUtility.merge(b1, b2);
        System.out.println(Arrays.toString(b3));

        System.out.println("---------------------");


        int[] c= {100, 200, 300, 400, 400, 500};
        int []reverse= new int[c.length];
        for (int i = c.length - 1,j=0; i >= 0; i--, j++) {
            reverse[j]=c[i];

        }
        System.out.println(Arrays.toString(reverse));

        System.out.println("------------------------------");

        String[] D= {"Happy", "New", "Year"};
        String[] E= ArraysUtility.reverse(D);
        System.out.println(Arrays.toString(E));*/
	/*
	 		Create a method that:
			is called twoTimes
			returns a new ArrayList of Integers
			takes in a single parameter - an ArrayList of Integers

			This method should create a new ArrayList of Integers
			that contains every value of the ArrayList parameter repeated twice.

			For example, if the parameter is
			(1,5,3,7)
			The method should return a new ArrayList of Integers with
			(1,1,5,5,3,3,7,7)
	 */


        int[] arr = {1, 1, 1, 1};

        System.out.println(goodPair(arr));

    }
// create your method below


    public static int goodPair(int[] array) {
        int output = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {


                if ( array[i] == array[j] ) {
                    output++;

                }
            }

        }
        return output;
    }
}

