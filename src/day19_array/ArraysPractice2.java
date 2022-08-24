package day19_array;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        int[] arr1 = new int[100];
        System.out.println(Arrays.toString(arr1));
        for (int i = 0, j = 1; i < arr1.length; i++, j++) {
            arr1[i] = j;
        }
        System.out.println("The result is : " + Arrays.toString(arr1));

        int[] num = new int[30];
        for (int i = 0, j = 30; i < num.length; i++, j--) {
            num[i] = j;
        }

        System.out.println(Arrays.toString(num));

        System.out.println("--------------------------");

        int[] num1 = new int[20];


        for (int l = num1.length - 1, m = 1; l >= 0; l--, m++) {
            num1[l] = m;
        }
        System.out.println(" Array if num1 = " + Arrays.toString(num1));
    }
        /*for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i += 1;
            System.out.println(Arrays.toString(arr1));

            System.out.println("--------------------------");

            int[]arr2= new int[100];
            for (int j = 0 - 1,k=100; j<=arr2.length; j++,k--) {
                arr2[i]=k;
                // arr2[i]=100-1;

                int[]arr3=new int[100];
                for (int i1 = arr3.length - 1; i1 >= 0; i1--) {
                arr3[i1]=100-1;

                }*/
}