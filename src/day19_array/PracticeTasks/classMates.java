package day19_array.PracticeTasks;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class classMates {
    public static void main(String[] args) {








            int[] num = {10, 0, 5, 0, 1, 0};
            Arrays.sort(num);
            for (int i = num.length - 1; i >= 0; i--) {
            }
            int[] result1 = ArraysUtility.reverse(num);
            System.out.println(Arrays.toString(result1));




        /*write a program that can move all the zeros to the end of the array
        Ex:
        array = {10, 0, 5, 0, 1, 0};

        output:
        {10, 5, 1, 0, 0, 0}*/


            String[] students = {"Mohammad karimi", "Lucy Gaid", "Diana Sagoyan", "Hasan Khan", "Khashayar Shayesta", "kadifa Kudik", "Ali Adili",
                    "Reza Andisha", "Elyas Hasan", "Nazgul Nazari"};
            for (int i = 0; i < students.length; i++) {

                students[i] = (students[i].substring(0, 1) + " " + students[i].charAt(students[i].indexOf(" ") + 1));
            }
            System.out.println(Arrays.toString(students));

            System.out.println("----------------------------------------");

            String[] classMates = {"Mohammad karimi", "Lucy Gaid", "Diana Sagoyan", "Hasan Khan", "Khashayar Shayesta", "kadifa Kudik", "Ali Adili",
                    "Reza Andisha", "Elyas Hasan", "Nazgul Nazari"};
            for (int i = 0; i < classMates.length; i++) {
                String reverse = "";
                for (int j = classMates[i].length(); j > 0; j--) {
                    reverse += classMates[i].charAt(j - 1);

                }
                System.out.println(reverse);
            }
        }
    }




