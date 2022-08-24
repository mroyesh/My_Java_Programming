package day19_array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int[]num= new int[100];
        for (int i = 0,j=100; i < num.length; i++,j--) {
            num[i]=j;

        }
        System.out.println(Arrays.toString(num));

    }
}
