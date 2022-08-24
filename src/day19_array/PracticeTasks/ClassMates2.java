package day19_array.PracticeTasks;

import java.util.Arrays;
import java.util.Scanner;

public class ClassMates2 {
    public static void main(String[] args) {

            int[] num = {1, 2, 3, 4, 5};
            int[] reverse = new int[num.length];
            for (int i = num.length - 1, j = 1; i >= 0; i--, j++) {
                reverse[i] = j;
            }
            System.out.println(Arrays.toString(reverse));


            System.out.println("----------------------------");

            String[] names = {"Anna", "Nancy", "Sarah"};
            int[] scores = {90, 75, 80};
            char[] grades = new char[names.length];
            for (int i = 0; i < names.length; i++) {
                grades[i] = (scores[i] > 90) ? 'A' : (scores[i] >= 80) ? 'B' : (scores[i] >= 70) ? 'C' : (scores[i] >= 60) ? 'D' : 'F';
                System.out.println(names[i] + "'s score is " + scores[i] + ", and grade is " + grades[i]);

                System.out.println("-------------------------------");


                String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
                double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
                int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};
                int indexOfGloves = 0;
                boolean iPadIsContains = true;
                for (int j = 0; j < items.length; j++) {
                    if ( items[j].equalsIgnoreCase("gloves") ) {
                        indexOfGloves = i;
                    }
                    if ( items[j].equalsIgnoreCase("ipad") ) {
                        iPadIsContains = true;
                    }
                    String shoppingItem = "";
                    shoppingItem += items[j] + " - " + prices[j] + " - " + itemIDs[j];
                    System.out.println(shoppingItem);

                }
                System.out.println(indexOfGloves);
                System.out.println(iPadIsContains);


            }


        }
    }









