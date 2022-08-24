package day20_forEachLoop;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Cydeo School";

        char[] ch= str.replace(" ","").toCharArray();
        //char [] reverse= new char[ch.length];
        //for (int i = ch.length - 1,j=0; i >= 0; i--,j++) {
            //reverse[j]= ch[i];

        char[] reverse1= ArraysUtility.reverse(ch);

        System.out.println("This is the reverse "+Arrays.toString(reverse1));


      // char[] ch1= ArraysUtility.reverse(ch);
        System.out.println(Arrays.toString(ch));
        //System.out.println(Arrays.toString(ch1));// we can reverse at the same time calling from reverse method.

        System.out.println("-----------------------");

        String str1 = "Today is Monday, Tomorrow is Tuesday";

        String [] word= str1.split(" ");// the splitting part is not included in the string

        System.out.println(Arrays.toString(word));



        System.out.println("----------------------------------");

        String sentence = "Today is a great day";

        System.out.println(Arrays.toString(sentence.split(" ")));

        String[] arr= ArraysUtility.reverse(sentence.split(" "));
        System.out.println(Arrays.toString(arr));

        String reverseSentences="";
        for (int i = 0; i < arr.length; i++) {
            reverseSentences+=arr[i];

        }
        System.out.println("this is the result of: "+reverseSentences);

        String[] arr1 = ArraysUtility.reverse(sentence.split(" "));

        //String[] arr =  ArraysUtility.reverse( sentence.split(" ") );  //[Java, love I]

        System.out.println(Arrays.toString(arr1));

        String reversedSentence = " "; //"Java love I"

        for (int i = 0; i < arr1.length; i++) {
            reversedSentence += arr1[i] + " ";
        }
        System.out.println("This is our final result: "+reversedSentence);

    }


    }

