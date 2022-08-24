package day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");
        map.put("A04", "Tatiana");

        Map<String , String>employee= new TreeMap<>();
        employee.putAll(map);
        System.out.println(employee);

        System.out.println(employee==map);  //false because of the equal operator which are not supposed to be used here

        System.out.println(map.equals(employee)); // true
    }
}
