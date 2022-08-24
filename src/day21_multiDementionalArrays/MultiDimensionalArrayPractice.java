package day21_multiDementionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {


        String[] group1 = {"Bilal Ghani", "Marika Tsotsonava", "Adelina Abdykanyeva", "M.Abdalla"};// 4 names
        String[] group2 = {"Sumeye N Dalkilinc", "Shukur", "Mohammad Karimi"};// 3 names
        String[] group3 = {"Umran Ozman", "Evgeniya Novgorodova", "Khashayar Shayesteh", "Lucy Gaid", "Abidullah Rahimi"};// 5 names
        String[] group4 = {"Lorraine Cannom", "Diana Sagoyan"};// 2 names

        String[][] groups = {group1, group2, group3, group4};
        for (int i = 0; i <groups.length ; i++) {
            String[]eachGroup= groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);

            }
        }

        for (int i = 0; i < groups.length; i++) {
            String[]eachGroup= groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent= eachGroup[j];
                System.out.println(eachStudent);
            }
        }
/*        System.out.println("----------------------------------------------------");
        for (int i = 0; i < groups.length; i++) {
            for (int j = 0; j <groups[i].length ; j++) {
                System.out.println(groups[i][j]);

            }

        }*/

        System.out.println("----------------------------------------------");
        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroups= groups[i];
            System.out.println(Arrays.toString(eachGroups));
            for (String eachStudent : eachGroups) {
                System.out.println(eachStudent);

            }


        }

        System.out.println(groups);// this printout's output is hashcode
        System.out.println(Arrays.toString(groups));// for single dimensional array.
        System.out.println(Arrays.deepToString(groups));// for every multi dimensional array

    }
}