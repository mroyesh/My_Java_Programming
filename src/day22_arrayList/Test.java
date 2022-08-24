package day22_arrayList;

import Utilities.ArraysUtility;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean hasNum = ArraysUtility.contains(numbers, 9);
        System.out.println(hasNum);

        System.out.println("-----------------------------------------");
        String[] student = {"Ali", "Aziz", "Yasin",};
        boolean nasYasin = ArraysUtility.contains(student, "Yasin");
        System.out.println("nasYasin = " + nasYasin);

        double[] d1 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        boolean hasNumber= ArraysUtility.contains(d1, 4.4);
        System.out.println("hasNumber = " + hasNumber);


    }
}
