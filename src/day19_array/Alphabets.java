package day19_array;

import java.util.Arrays;

public class Alphabets {
    public static void main(String[] args) {
        char[] ascending = new char[26];  // 0~25
        char[] descending = new char[26]; //
        for (int i = 0,j='A',k='Z'; i < ascending.length; i++,j++,k--) {
            System.out.println(Arrays.toString(ascending));
            ascending[i]=(char)  j;
            descending[i]=(char) k;
        }
        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));


        char[] characters = new char[65535];
        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) i;

        }
        System.out.println(Arrays.toString(characters));
    }


}
