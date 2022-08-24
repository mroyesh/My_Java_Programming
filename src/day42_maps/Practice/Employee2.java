package day42_maps.Practice;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Employee2 {
    public static void main(String[] args) {

        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(2018, 9, 5));
        map.put("Antony", LocalDate.of(2012, 7, 29));
        map.put("Jimmy", LocalDate.of(2014, 4, 1));
        map.put("James", LocalDate.of(2016, 11, 2));
        map.put("Josh", LocalDate.of(2020, 5, 15));
        map.put("Cory", LocalDate.of(2015, 6, 19));
        map.put("Anderson", LocalDate.of(2013, 8, 24));
        map.put("Steven", LocalDate.of(2017, 10, 2));

        for (Map.Entry<String, LocalDate> hiredDate : map.entrySet()) {
            if(hiredDate.getValue().getYear()<2015){
                System.out.println(hiredDate.getKey());
            }
        }






    }
}
