package day40_collection;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
        Collection <Integer> collection= new ArrayList<>();

        collection.add(100);
        collection.addAll(Arrays.asList(200, 300, 400, 500, 600));

        System.out.println(collection);

        System.out.println(((ArrayList) collection).get(3));


        //System.out.println(((Stack)collection).pop());

        System.out.println("---------------------------------------------");



        Collection<Integer> collection1= new HashSet<>();

        collection.addAll(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println(collection1);

       // System.out.println(new (ArrayList( collection1).get(3)));


        Collection< Integer> collection2= new LinkedHashSet<>();
        collection2.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700, 100, 100, 100));

        System.out.println(collection2);

        System.out.println("-----------------------------------------");


        Collection<Integer > collection3= new TreeSet<>();
        collection3.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700, 100, 100, 100));
        System.out.println(collection3);

    }

}
