package day19_array;

import java.util.Arrays;

public class ArraysLiterals {
    public static void main(String[] args) {
        int[]numbers= new int[5];
        int[]nums={1,2,3,4,5};// if we know the number of elements and what are they we can do instating arrays literals.
        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("numbers="+Arrays.toString(numbers));

        System.out.println("-------------------------------");

        //String[]days= new String[7];
        String[]days={"Monday","Tuesday","Wednesday","...","Sunday"};
        System.out.println(Arrays.toString(days));

        System.out.println("----------------------------------------------");
        String[]months={"january","Feb","March","December"};
        System.out.println(numbers[2]);

        System.out.println("-----------------------------------------------");
        for (int i = months.length - 1; i >= 0; i--) {
            System.out.println(months[i]);

        }
    }
}
