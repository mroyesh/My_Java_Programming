package day21_multiDementionalArrays;

import java.util.Arrays;

public class MultiDementionalArrayIntro {
    public static void main(String[] args) {
        int[]arr1= {10, 20, 30};
        int[]arr2= {40, 50, 60, 70, 80};
        int[]arr3= {90, 100};


        System.out.println("-----------------------------------------");


        int[][] arr2D={ {90, 100}, {40, 50, 60, 70, 80},{10, 20, 30} };

        System.out.println(arr2D.length);


        System.out.println(Arrays.toString(arr2D[2]));
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));


        System.out.println(arr2D[2][0]);
        System.out.println(arr2D[1][2]);

    }
}
