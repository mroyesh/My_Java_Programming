package day20_forEachLoop;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {


        int[] num = {600, 690, 1223, 599, 900, 200};
        int[] reverse = ArraysUtility.reverse(num);
        System.out.println(Arrays.toString(reverse));

        System.out.println("------------------------");

        double[] d1 = {2.5, 3.5, 4.5, 6.5, 7.5, 8.5};
        double[] d3 = ArraysUtility.reverse(d1);
        System.out.println(Arrays.toString(d3));

        System.out.println("------------------------");

        double[] d2 = {9.6, 10.5, 11.5, 12.5, 13.5};
        double[] d4 = ArraysUtility.reverse(d2);
        System.out.println(Arrays.toString(d4));

        System.out.println("---------------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        char[]ch2= ArraysUtility.reverse(ch1);
        System.out.println(Arrays.toString(ch2));

    }
}
