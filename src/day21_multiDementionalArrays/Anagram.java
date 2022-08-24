package day21_multiDementionalArrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "earth";
        //char[] ch1 = str1.toCharArray();
        //char[] ch2 = str2.toCharArray();
        String [] ch1= str1.split("");
        String [] ch2= str2.split("");

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean isAnagram = Arrays.equals(ch1, ch2);
        System.out.println("isAnagram = " + isAnagram);
    }
}