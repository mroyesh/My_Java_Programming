package day42_maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice4 {
    public static void main(String[] args) {
        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000);
        person1.put("Hire Date", LocalDate.of(2020, 1, 12));
        person1.put("married", true);


        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Ali");
        person2.put("gender", 'M');
        person2.put("age", 34);
        person2.put("job_title", "Developer");
        person2.put("salary", 96000);
        person2.put("Hire Date", LocalDate.of(2021, 5, 15));
        person2.put("married", true);

        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Yasin");
        person3.put("gender", 'M');
        person3.put("age", 34);
        person3.put("job_title", "Developer");
        person3.put("salary", 120000);
        person3.put("Hire Date", LocalDate.of(2021, 7, 4));
        person3.put("married", true);

        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "Khatema");
        person4.put("gender", 'F');
        person4.put("age", 28);
        person4.put("job_title", "Developer");
        person4.put("salary", 100000);
        person4.put("Hire Date", LocalDate.of(2022, 6, 23));
        person4.put("married", true);

        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Nazgul");
        person5.put("gender", 'F');
        person5.put("age", 28);
        person5.put("job_title", "Developer");
        person5.put("salary", 100000);
        person5.put("Hire Date", LocalDate.of(2022, 1, 12));
        person5.put("married", true);


        Map<Integer, Map<String, Object>>mapOfMaps= new LinkedHashMap<>();

        mapOfMaps.put(1, person1);
        mapOfMaps.put(2, person2);
        mapOfMaps.put(3, person3);
        mapOfMaps.put(4, person4);
        mapOfMaps.put(5, person5);


        System.out.println(mapOfMaps);

        mapOfMaps.get(1).replace("salary", 120000);

        System.out.println(mapOfMaps.get(1));

        for (Map<String, Object> eachValue : mapOfMaps.values()) {

            //System.out.println(eachValue);
            for (Map.Entry<String, Object> eachEntry : eachValue.entrySet()) {
                if(eachEntry.getKey().equals("salary")){
                    eachEntry.setValue((Integer)eachEntry.getValue()+10000);
                }

            }

        }
        System.out.println(mapOfMaps);

    }
}
