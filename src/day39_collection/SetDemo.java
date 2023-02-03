package day39_collection;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();// Accept duplicates, keeps insertion order, has index.
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5));
        list1.addAll(Arrays.asList(6, 7, 8, 9));
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50));
        list1.addAll(Arrays.asList(60, 70, 80, 90));
        System.out.println(list1);

        System.out.println("-----------------------------------------");

        Set<Integer> set1 = new HashSet<>();// order is random, accepts null key

        set1.addAll(Arrays.asList(10, 20, 30, 40, 50));
        set1.addAll(Arrays.asList(60, 70, 80, 90));
        set1.addAll(Arrays.asList(100, 200, 300, 400, 500));
        set1.addAll(Arrays.asList(600, 700, 800, 900));

        System.out.println(set1);

        System.out.println("--------------------------");

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.addAll(Arrays.asList(10, 20, 30, 40, 50));
        set2.addAll(Arrays.asList(60, 70, 80, 90));
        set2.addAll(Arrays.asList(100, 200, 30, 40, 50));
        set2.addAll(Arrays.asList(60, 70, 80, 90));
        set2.addAll(Arrays.asList(12, 13, 14, 15));
        System.out.println(set2);


        System.out.println("---------------------------------------");

        Set<Integer> set3 = new TreeSet<>();
        set3.addAll(Arrays.asList(1, 2, 3, 4, 5));
        set3.addAll(Arrays.asList(6, 7, 8, 9, 10));
        set3.addAll(Arrays.asList(11, 12, 13, 14, 15));
        set3.addAll(Arrays.asList(16, 17, 18, 19));

        System.out.println(set3);

        System.out.println("------------------------------------------");


        String[] words = {"Java", "Java", "Java", "Python", "Python", "C#", "C++", "Ruby", "C#", "C#"};

        Set<String> result = new LinkedHashSet<>();
        result.addAll( Arrays.asList(words) );

        System.out.println(result);

        /*
        // System.out.println(result.get(1));
        for (String each : result) {
            System.out.println(each);
        }
        */

        System.out.println( new ArrayList<>(result).get(1) );

        words = result.toArray(new String[0]);  // converting Set to Array


        System.out.println("Words Array : " + Arrays.toString(words));


        System.out.println("----------------------------------------");


        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 10, 10, 20, 20, 30, 30, 30, 40, 40, 40, 50, 50, 50,5, 5, 5, 1, 1, 1, 2, 2,2));

        Set<Integer> n = new TreeSet<>(numbers); // List to Set

        System.out.println(n);




    }
}


