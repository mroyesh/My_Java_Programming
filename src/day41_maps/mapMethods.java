package day41_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapMethods {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");
        map.put("A04", "Tatiana");
        map.put("A05", "Tatiana");
        map.put("A06", "Tatiana");
        map.put("A07", "Tatiana");

        System.out.println(map.size());
        System.out.println(map);
        // map.get(key)== this gives the value assigned to the given key

        System.out.println(map.get("A04"));

        map.put("A04", "Lucy");
        map.put("A06", "Madiyar");

        System.out.println(map);

        System.out.println(map.get("B03"));

        map.replace("C02", "Aseel");
        // in the replace method we should first enter the key and the new value we want to assign to the given key.
        map.replace("A07", "Marika");
        System.out.println(map);

        map.remove("A05");
        // remove method needs key of the targeted value we need to remove from our map

        System.out.println(map);


        System.out.println(map.containsKey("B03"));
        System.out.println(map.containsKey("H98"));
        // in the containsKey we need to return true/false if a key is in the map
        // in the containsValue we want to return boolean result if the value is included in the map

        System.out.println(map.containsValue("Lucy"));
        System.out.println(map.containsValue("Muhtar"));

        System.out.println(map.isEmpty());
        System.out.println(map.equals(map));

        map.clear();

        System.out.println(map);
        map.put("12", "Aziz");
        map.get("12");
        map.keySet();
        map.entrySet();
        map.values();
        map.containsValue("Aziz");
        map.getOrDefault("12", "");

        // containsKey:
        // containsValue:
        // isEmpty:
        // is




        // Main method


        // Create a HashMap and add some values
        HashMap<String, Integer> map1
                = new HashMap<>();
        map1.put("a", 100);
        map1.put("b", 200);
        map1.put("c", 300);
        map1.put("d", 400);

        // print map details
        System.out.println("HashMap: "
                + map1.toString());

        // provide key whose value has to be obtained
        // and default value for the key. Store the
        // return value in k
        int k = map1.getOrDefault("b", 500);

        // print the value of k returned by
        // getOrDefault(Object key, V defaultValue) method
        System.out.println("Returned Value: " + k);
    }
}
/*
pares: id-name
 */