package day41_maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        Map<String, Integer> hashMap= new HashMap<>();

        hashMap.put("Yasin", 150000);
        hashMap.put("Nazgul", 120000);
        hashMap.put(null, null);
        hashMap.put("null", null);
        hashMap.put(null, null);
        hashMap.put("Wania", 120000);
        hashMap.put("Yasin", 150000);
        // hashmap accepts one null in key and multiple null in value
        // order is random.


        System.out.println("hashMap = " + hashMap);


        System.out.println(hashMap.get("Yasin"));
        System.out.println(hashMap.size());
        System.out.println(hashMap.remove(null));
        System.out.println(hashMap.containsKey("Wania"));
        System.out.println(hashMap.equals(hashMap));
        System.out.println(hashMap.replace("Yasin", 170000));
        //hashMap.replace("Yasin", 170000);
        System.out.println(hashMap.get("Yasin"));
        System.out.println("hashMap = " + hashMap);



        System.out.println("------------------------------------------------");


        Map<String, String>linkedHashMap= new LinkedHashMap<>();
        linkedHashMap.put("Yasin", "Developer");
        linkedHashMap.put("Javid", "Java Developer");
        //linkedHashMap.put("null", " null");
        linkedHashMap.put(null, null);
        linkedHashMap.put(null, null);
        linkedHashMap.put("Yasin", "Developer");
        linkedHashMap.put("Aziz", "Developer");
        // one null in key and insertion order


        System.out.println("linkedHashMap = " + linkedHashMap);


        System.out.println("-------------------------------------------------");


        Map<Integer, Integer>treeMap= new TreeMap<>();

        treeMap.put(12, 120000);
        treeMap.put(10, 100000);
        treeMap.put(11, 110000);
        treeMap.put(13, 130000);
        treeMap.put(10, 1000000);
        treeMap.put(14, 100000);
        //treeMap.put(null, 120000);// the key can not be null.
        //treeMap.put(null, null);
        //treeMap.put(null, 150000);

        // keys ascending order
        // accepts null as a value only
        treeMap.put(15, null);


        System.out.println("treeMap = " + treeMap);


        System.out.println("-------------------------------------------------");


        Map<String, Integer>hashTable= new Hashtable<>();
        hashTable.put("Armina", 4);
        hashTable.put("Nazgul", 27);
        hashTable.put("Yasin", 35);
        hashTable.put("Yasin", 30);
        hashTable.put("Ali", 35);
        //hashTable.put(null, null);
        // do not accept null as key and value.
        // random order

        //hashTable.put("Reza", null);


        System.out.println("hashTable = " + hashTable);



        /*Map<String, Integer> hashMap = new HashMap<>();// random order, accepts null key & null values
        hashMap.put("Yasin", 120000);
        hashMap.put("Hadi", 110000);
        hashMap.put("Javid", 130000);
        hashMap.put("Bella", 105000);
        hashMap.put("Nazgul", 124000);
        hashMap.put("Wania", 290000);
        hashMap.put("null", null);
        hashMap.put("Ali", null);
        hashMap.put(null, null);
        hashMap.put(null, null);


        System.out.println("hashMap = " + hashMap);


        Map<String, Integer> map1 = new LinkedHashMap<>();//insertion order

        map1.put("Yasin", 110000);
        hashMap.put("Hadi", 110000);
        hashMap.put("Javid", 130000);
        hashMap.put("Bella", 105000);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); // insertion order, accepts null key  & null values
        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        // map1.put("Daniel", 80000);
        linkedHashMap.put("Arron", 78000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Breanna", null);
        linkedHashMap.put(null, 120000);
        linkedHashMap.put(null, 110000);
        linkedHashMap.put(null, 100000);


        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("--------------------------------------------------------------------");

        Map<String, Integer> treeMap = new TreeMap<>(); // sorted order, does not accept null key, accepts null values
        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        // map1.put("Daniel", 80000);
        treeMap.put("Arron", 78000);
        treeMap.put("Chris", null);
        treeMap.put("Breanna", null); // value can be null in treeMap
        // treeMap.put(null, 120000); key can not be null in treeMap
        //   treeMap.put(null, 110000);
        //   treeMap.put(null, 100000);

        System.out.println("treeMap = " + treeMap);


        System.out.println("--------------------------------------------------------------------");

        Map<String, Integer> hashtable = new Hashtable<>(); // random order, does not accept null key & null values, Synchronized
        hashtable.put("Daniel", 95000);
        hashtable.put("Emily", 100000);
        hashtable.put("Bella", 85000);
        // map1.put("Daniel", 80000);
        hashtable.put("Arron", 78000);
        // hashtable.put("Chris", null); Value in Hashtable can not be null
        // hashtable.put("Breanna", null); Value in Hashtable can not be null
        // hashtable.put(null, 120000); Key in Hashtable can not be null
        // hashtable.put(null, 110000); Key in Hashtable can not be null

        try {
            hashtable.put("Diana", 100000);
        }catch (RuntimeException e){
            e.printStackTrace();
        }


        System.out.println("hashtable = " + hashtable);

         */


    }
}
