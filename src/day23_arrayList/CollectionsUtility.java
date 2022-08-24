package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,10,12,14,90,0,-12,70, -120,4,5,6,7,8,9));
        int max= Collections.max(list);
        int min= Collections.min(list);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("-------------------------------------------------------");


        ArrayList<Integer>num= new ArrayList<>(Arrays.asList(1,2,34,5,6,7,7,6324,1,14,1,41,14,21,-5));
        int max1= Collections.max(num);
        System.out.println(max1);
        int min1= Collections.min(num);
        System.out.println(min1);




    }
}
