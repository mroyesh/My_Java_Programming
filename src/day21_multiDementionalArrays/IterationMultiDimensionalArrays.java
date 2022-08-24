package day21_multiDementionalArrays;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class IterationMultiDimensionalArrays {
    public static void main(String[] args) {

        int[][] arr2D = { {10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100} };


      for (int i = 0; i < arr2D.length; i++) { // index number of one dimensional arrays in arr2D

            int[] each1D = arr2D[i];
            System.out.println(Arrays.toString(each1D));
            for (int j = 0; j < each1D.length; j++) { // index number of elements in each one dimensional arr2D
                int eachElements = each1D[j];
                System.out.println(eachElements);

            }


          System.out.println("-----------------------------------------");

        }

        for (int[] each1D : arr2D)
            for (int eachElements : each1D) {
                System.out.println( eachElements);
        }

        System.out.println("---------------------------------");


        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.println(arr2D[i][j]);

                System.out.println("--------------------------------");

                for (int[] each1DArray : arr2D) {
                    for (int eachElements : each1DArray) {
                        System.out.println(eachElements);

                    }

                }


            }

        }
        System.out.println("================================================");

        int[][] arr2d = { {10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100} };
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.print(arr2d[i][j]+" ");


            }

        }


    }
}
