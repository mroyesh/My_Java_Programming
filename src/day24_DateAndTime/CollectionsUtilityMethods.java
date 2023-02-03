package day24_DateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java", "Python", "C#", "Ruby", "Swift"));
        System.out.println(names);


       Collections.replaceAll(names,"Java", "Yasin");

        System.out.println(names);

        int frequency= Collections.frequency(names, "Java");
        System.out.println(frequency);


        /*Collections.replaceAll(names, "Java", "Python");
        System.out.println(names);
        int freCount = Collections.frequency(names, "Java");
        System.out.println(freCount);*/


        System.out.println("-----------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 10, 20, 30, 40, 50, 60, 70, 80, 90, 10, 20, 40, 50, 60));
        int countFrequency = Collections.frequency(list, 10);
        System.out.println(countFrequency);

        System.out.println("-----------------------------------------------");


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 20, 30, 10, 10, 10, 20, 30, 40, 50, 60, 70, 80, 90));
        for (Integer each : numbers) {
            if (Collections.frequency(numbers, each) == 1) {
                System.out.println(each);
            }
        }
        }
    }

