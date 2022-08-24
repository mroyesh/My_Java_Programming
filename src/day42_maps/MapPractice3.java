package day42_maps;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {
    public static void main(String[] args) {
        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("Hire Date", LocalDate.of(2020, 1, 12));
        person1.put("married", true);

        System.out.println("-------------------------------------------");


        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Ali");
        person2.put("gender", 'M');
        person2.put("age", 34);
        person2.put("job_title", "Developer");
        person2.put("salary", 96000.0);
        person2.put("Hire Date", LocalDate.of(2021, 5, 15));
        person2.put("married", true);

        System.out.println("----------------------------------------------");


        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Yasin");
        person3.put("gender", 'M');
        person3.put("age", 34);
        person3.put("job_title", "Developer");
        person3.put("salary", 120000.0);
        person3.put("Hire Date", LocalDate.of(2021, 7, 4));
        person3.put("married", true);


        System.out.println("------------------------------------------------");


        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "Khatema");
        person4.put("gender", 'F');
        person4.put("age", 28);
        person4.put("job_title", "Developer");
        person4.put("salary", 100000.5);
        person4.put("Hire Date", LocalDate.of(2022, 6, 23));
        person4.put("married", true);


        System.out.println("--------------------------------------------------");

        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Nazgul");
        person5.put("gender", 'F');
        person5.put("age", 28);
        person5.put("job_title", "Developer");
        person5.put("salary", 100000.5);
        person5.put("Hire Date", LocalDate.of(2022, 1, 12));
        person5.put("married", true);
        Map<String, Object>[] arraysOfMap = new Map[5];
        System.out.println(Arrays.toString(arraysOfMap));

        System.out.println("---------------------------------------------------");

        arraysOfMap[0] = person1;
        arraysOfMap[1] = person2;
        arraysOfMap[2] = person3;
        arraysOfMap[3] = person4;
        arraysOfMap[4] = person5;

        System.out.println(Arrays.toString(arraysOfMap));

        arraysOfMap[1].replace("salary",(Double)arraysOfMap[1].get("salary")+10000);

        System.out.println(Arrays.toString(arraysOfMap));

        arraysOfMap[1].replace("name", "Hasan");

        System.out.println(Arrays.toString(arraysOfMap));


        System.out.println("--------------------------------------------------");

        for (Map<String, Object> eachMap : arraysOfMap) {



            System.out.println(eachMap);

        }

    }

}
