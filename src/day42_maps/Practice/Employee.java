package day42_maps.Practice;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 125000);
        map.put("Steven", 135000);

        int maxSalary = Collections.max(map.values());
        int minSalary = Collections.min(map.values());

        System.out.println("Max Salary: $" + maxSalary + "\nMin Salary: $" + minSalary);

        int employees = 0;

        for (Integer salary : map.values()) {
            if ( salary > 120000 && salary < 150000 ) {
                employees++;
            }
        }
        System.out.println(employees);


        for (Integer names : map.values()) {
            if(names<118000){
        }
        }
        System.out.println(map.keySet());


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue()<120000){
                map.replace(entry.getKey(), entry.getValue()+10000);
        }
    }
        System.out.println(map);


    }

}


