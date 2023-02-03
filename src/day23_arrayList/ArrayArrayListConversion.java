package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "E"};


        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        String[] change= list.toArray(new String[0]);
        System.out.println(list);

        System.out.println("---------------------------");

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("java", "python", "C#"));
        String[] language = list1.toArray(new String[0]);

        System.out.println(list1);
        System.out.println(Arrays.toString(language));


    }
}
