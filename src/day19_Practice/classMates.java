package day19_Practice;

import java.util.Arrays;

public class classMates {
    public static void main(String[] args) {
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
                reverse += classMates[i].charAt(j-1);

            }
            System.out.println(reverse);
        }
    }
}



