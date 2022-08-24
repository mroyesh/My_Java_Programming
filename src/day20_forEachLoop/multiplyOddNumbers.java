package day20_forEachLoop;

import java.util.Arrays;

public class multiplyOddNumbers {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4, 5};
        for (int i = 0; i < num1.length; i++) {
            if ( num1[i] % 2 == 0 ) {
                continue;
            } else {
                num1[i] = num1[i] * 2;
            }
        }
        System.out.println(Arrays.toString(num1));


        for (int i = 0; i < num1.length; i++) {
            if ( num1[i] % 2 == 0 ) {
                continue;
            }
            num1[i] = num1[i] * 2;
        }
        System.out.println(Arrays.toString(num1));
    }
}

