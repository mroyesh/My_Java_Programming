package day23_arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayListMethods {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        array[0] = 100;
        System.out.println(Arrays.toString(array));

        System.out.println("------------------------");
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("eggs");
        groceryList.add("Paper Towel");
        groceryList.add("Apple");
        groceryList.add("cooking Oil");
        groceryList.set(2, "orange");
        System.out.println(groceryList);
        groceryList.remove(0);
        groceryList.remove("orange");
        groceryList.remove("cooking oil");// we can remove by index number or object name.


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        boolean n1 = numbers.remove(Integer.valueOf(20));
        System.out.println(numbers);

        System.out.println("------------------------------------------");

        numbers.clear();
        System.out.println(numbers);
        System.out.println(numbers.size());


        System.out.println("--------------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("yasin");
        names.add("Ali");
        names.add("Javid");
        names.add("Reza");
        names.add("Diana");
        names.add("Ali");

        System.out.println(Arrays.asList(names));
        System.out.println(names.indexOf("Ali"));
        System.out.println(names.indexOf("Diana"));
    }
}
