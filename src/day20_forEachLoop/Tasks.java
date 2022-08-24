package day20_forEachLoop;

import Utilities.ArraysUtility;
import lab06_CustomMethod.StringUtility;

public class Tasks {
    public static void main(String[] args) {

        /*String sentences= "I love Java";
        String[] secondReverse= sentences.split(" ");
        String result= "";
        for (int i = 0; i < secondReverse.length; i++) {
            if(i==1){
                String word= secondReverse[i];
                for(int j = word.length() - 1; j >= 0; j --){
                    result += word.charAt(j) ;
                }
                result += " ";
            } else {
                result +=  secondReverse[i] + " ";
            }
        }

        System.out.println(result);





        /*
        1. Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
         */


        /*int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        for (int each : arr1) {
            for (int elements : arr2) {
                if(each==elements){
                    System.out.println(each);
                }

            }
            /*
Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}
          output:
              4 5
          MUST use for each loops
 */

        /*String[] arr= {"anna", "level", "Java"};
        int count=0;
        for (String each : arr) {
            String reverse="";
            for(int i=each.length()-1; i>=0; i--){
                reverse+=each.charAt(i);
            }
            if(each.equalsIgnoreCase(reverse)) {
                count++;
            }
        }
        System.out.println(count);

        /*
        4. write a program that can count how many palindromes in an array of string
        Ex:
        {"anna", "level", "Java"};
        output:
        2
         */

       // System.out.println("-----------------------------------");

        /*int[] array = {1, 1, 2, 3, 3, 3, 4, 5, 5, 5, 5};

        for (int each : array) {
            int count=0;
            for (int elements : array) {
                if(each==elements){
                    count++;
                }
            }
            if(count==1){
                System.out.println(each);
            }

        }


        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int odd = 0;
        int even = 0;
        for (int each : num) {
            if ( each % 2 == 0 ) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even number: " + even);
        System.out.println("Odd number: " + odd);

        System.out.println("--------------------------");

        int[] n1 = {1, 2, 3, 4, 5};
        int[] n2 = {4, 5, 6, 7, 8};
        for (int each : n1) {
            for (int i : n2) {
                if ( each == i ) {
                    System.out.print(each + " ");

                }

            }
        }


    }
}


/* Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";
            output:
                I evoL Java
 */

    }
}

