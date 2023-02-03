package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharactors {
    public static void main(String[] args) {
        String str = "aaabbbbccccc";
        String result = "";
        String[] arr = str.split("");
        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList(arr));

        for (String each : arr1) {
            int frequency=Collections.frequency(arr1, each);
            if(!result.contains(each)){
                result+=each+frequency;
            }
        }
        System.out.println(result);

//        for (String each : str.split("")) {
//            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
//            if (!result.contains(each)) {
//                result += each + frequency;
//            }
//        }
//        System.out.println(result);
    }
}
