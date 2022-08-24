package day23_arrayList.PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoArrayList {
    public static void main(String[] args) {
        String [] arr1= {"A","B","C"};
        String []arr2= {"D","E","F","G"};

        ArrayList<String> arr3= new ArrayList<>();
        arr3.addAll(Arrays.asList(arr1));
        arr3.addAll(Arrays.asList(arr2));
        System.out.println(arr3);




    }
}
