package day21_multiDementionalArrays;

import Utilities.ArraysUtility;
import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class AddElementsYesNo {
    public static void main(String[] args) {
        int[]n1= {1,2,3,4,5,6,7,8,9};

        System.out.println(ArraysUtility.contains(n1,9));
        System.out.println(ArraysUtility.contains(n1,4));

        System.out.println("--------------------------------------");

        double[] d1={1.5, 2.5, 3.5, 4.5, 5.5, 6.5};
        System.out.println(ArraysUtility.contains(d1, 3.5));

        System.out.println("----------------------------------------");

        char[]ch= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        System.out.println(ArraysUtility.contains(ch, 'k'));

        String[]str= {"Yasin", "Ali", "Reza", "Muktar", "Mohammad"};
        System.out.println(ArraysUtility.contains(str, "Yasin"));
    }
}
