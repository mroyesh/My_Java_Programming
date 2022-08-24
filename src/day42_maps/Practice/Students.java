package day42_maps.Practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Students {
    public static void main(String[] args) {
        Map<String, int[]>students=new LinkedHashMap<>();
        int[] student1={67, 79, 75, 90, 95};
        int[] student2=  {89, 90, 95, 85, 83};
        int[] student3= {90, 92, 97, 94, 84};
        int[] student4= {98, 90, 68, 79, 87};
        int[] student5= {97, 95, 87, 88,95};
        students.put("Ali", student1 );
        students.put("Yasin", student2);
        students.put("Aziz", student3);
        students.put("Javid", student4);
        students.put("Zabih", student5);

        for (Map.Entry<String, int[]> eachStudent : students.entrySet()) {
            System.out.println(eachStudent.getKey()+ " : "+ Arrays.toString(eachStudent.getValue()));
        }

    }
}
