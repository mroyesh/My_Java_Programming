package day20_forEachLoop;

import java.util.Arrays;

public class ForeachLoopPractice {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int each : numbers) {
            if ( each % 2 != 0 ) {
                System.out.println(each);


            }

        }

        System.out.println("__________________________-------------------");
        int[]num= {100, 12, 24, 24, 34, 234, 34, 3454,10};
        int max= num[0];
        int min= num[0];
        for (int each : num) {
            if(each>max){
                max=each;
        }
            if(each<min){
                min=each;
            }

        }
        System.out.println(max);
        System.out.println(min);

        System.out.println("-----------------------");

        int[]arr1= {1,2,3,4,6,7,8,9};
        int[]arr2= {10,11,12,13,14,15};

        int[]arr3= new int[arr1.length+arr2.length];
        int k=0;
        for (int each : arr1) {
            arr3[k++]=each;

        }
        for (int each : arr2) {
            arr3[k++]=each;
        }
        System.out.println(Arrays.toString(arr3));

        System.out.println("---------------------");

        String[] names= {"Ali Adili","Yasin Tawasulli", "Reza Saedi"};
        for (String each : names) {
            System.out.println(each.charAt(0)+"."+each.charAt(each.lastIndexOf(" ")+1));


        }

    }
}
