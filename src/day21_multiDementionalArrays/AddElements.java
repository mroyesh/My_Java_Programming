package day21_multiDementionalArrays;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int element = 6;
        int[]array2= {7,8,9,10};
        int j=0;
        int [] new_array= new int[ array.length+array2.length];
        for (int i = 0; i < array.length; i++,j++) {
            new_array[j]=array[i];
        }
        for (int i = 0; i < array2.length; i++,j++) {
            new_array[j]=array2[i];

        }
        //new_array[new_array.length-4]=element;
        System.out.println(Arrays.toString(new_array));


        System.out.println("------------------------------------");

        int[] numbers = {100, 90, 80, 70, 60};
        System.out.println(Arrays.toString(numbers));
        numbers=ArraysUtility.addElement(numbers,50);
        numbers=ArraysUtility.addElement(numbers, 40);
        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------------------------");


        double[] nums= {2.5, 3.5, 4.5, 6.5, 7.5};
        System.out.println(Arrays.toString(nums));
        nums= ArraysUtility.addElement(nums, 8.5);
        System.out.println(Arrays.toString(nums));

        System.out.println("-------------------------------------");

        char[]ch= {'A', 'B', 'C', 'D', 'E'};
        System.out.println(Arrays.toString(ch));
        ch= ArraysUtility.addElement(ch,'F');
        System.out.println(Arrays.toString(ch));

        System.out.println("---------------------------------------");

        String []str={"Yasin", "Sumeye", "Ermek"};
        System.out.println(Arrays.toString(str));
        str= ArraysUtility.addElement(str, "Ali");
        System.out.println(Arrays.toString(str));


        /*String str1= "Today is java day and tomorrow is interview day";  this is extra practice for hwo can we convert a string to char array
        char[] result= str1.replace(" ","").toCharArray();


        System.out.println(Arrays.toString(result));  // extra practice for converting string to string array


        String str1= "Today is java day and tomorrow is interview day";

        String [] newStr= str1.split(" ");
        System.out.println(Arrays.toString(newStr));*/





    }
}
