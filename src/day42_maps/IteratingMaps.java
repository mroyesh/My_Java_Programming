package day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMaps {

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("Yasin", 110000);
        map.put("Aziz", 90000);
        map.put("Emily", 90000);
        map.put("Aaron", 95000);
        map.put("Diana", 120000);
        map.put("Daniel", 95000);
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        map.put("Arron", 78000);
        map.put("Jimmy", 78000);
        map.put("Breanna", 98000);
        System.out.println("This is our map result:");
        System.out.println( map);

        System.out.println("-------------------------------------");

        //iterating the map by keys
        for (String eachKey : map.keySet()) {
            System.out.println("Each value: ");
            System.out.println(eachKey);
        }


        System.out.println("---------------------------------------");

        //Iterating the map by value
        for (Integer eachValue : map.values()) {
            System.out.println("this is each value in the map: "+eachValue);
        }

        System.out.println("---------------------------------------");

        //Iterating the map by entries/ pairs

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            System.out.println("This is each set of key-value in the map: "+ eachEntry);
        }

        System.out.println("-----------------------------------------");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {

            String eachKey = eachEntry.getKey();
            Integer eachValue = eachEntry.getValue();
            eachEntry.setValue(eachValue + 10000);


            System.out.println(eachKey);
            System.out.println(eachValue);

        }
        System.out.println(map);

    }
}
