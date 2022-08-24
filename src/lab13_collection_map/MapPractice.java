package lab13_collection_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Object> car1= new LinkedHashMap<>();
        car1.put("Brand","BMW" );
        car1.put("Model", "X5");
        car1.put("Body", "SUV");
        car1.put("Year", 2022);
        car1.put("Auto", true);
        car1.put("Price", 60000);
    }
}
