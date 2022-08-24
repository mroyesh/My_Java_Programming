package day42_maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {
        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        System.out.println("-------------------------------------------");

        // how many female and male employees are in teh map?
        int countMaleEmployee = 0;
        int countFemaleEmployee = 0;

       /* for (String name : employeeMap.keySet()) {

            String gender= employeeMap.get(name);
            if(gender.equals("M")){
                countMaleEmployee++;

            }else{
                countFemaleEmployee++;
            }

        }*/

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if ( eachEntry.getValue().equals("M") ) {
                eachEntry.setValue("Male");
            } else {
                System.out.println("Female");
            }
        }
        System.out.println(employeeMap);

        System.out.println("-------------------------------------------");

        for (String eachValue : employeeMap.values()) {

            if ( eachValue.equals('M') ) {
                countMaleEmployee++;

            } else {
                countFemaleEmployee++;
            }
        }
        System.out.println("countMaleEmployee = " + countMaleEmployee);
        System.out.println("countFemaleEmployee = " + countFemaleEmployee);

        System.out.println("----------------------------------------------");

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.equals("M")){
                eachEntry.setValue("Male");
            }else {
                eachEntry.setValue("Female");
            }
        }
        System.out.println(employeeMap);
    }
}
