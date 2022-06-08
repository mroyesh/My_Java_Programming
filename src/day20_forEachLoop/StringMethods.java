package day20_forEachLoop;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Cydeo School";
        char[] ch= str.replace(" ","").toCharArray();
        System.out.println(Arrays.toString(ch));

        System.out.println("-----------------------");

        String str1 = "Today is Monday, Tomorrow is Tuesday";

        String[] word = str1.split(" "); // the splitting part is not included in the string
        System.out.println(Arrays.toString(word));


        System.out.println("----------------------------------");

        String sentence = "Today is a great day";

        String[] arr = ArraysUtility.reverse(sentence.split(" "));

        //String[] arr =  ArraysUtility.reverse( sentence.split(" ") );  //[Java, love I]

        System.out.println(Arrays.toString(arr));

        String reversedSentence = " "; //"Java love I"

        for (int i = 0; i < arr.length; i++) {
            reversedSentence += arr[i] + " ";
        }
        System.out.println(reversedSentence);

    }


    }

