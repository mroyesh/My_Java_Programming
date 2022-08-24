package day23_arrayList.PracticeTasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveName {
    public static void main(String[] args) {


       /*ArrayList<String>names= new ArrayList<>();
       names.addAll(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"));
       names.removeAll(Arrays.asList("Ahmad"));
        System.out.println(names);

        System.out.println("--------------------------------------");

        ArrayList<Integer>nums= new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(nums);
        nums.addAll(nums);

        System.out.println("Numbers: "+nums);


        System.out.println("---------------------------------------");*/

        /*
         ArrayList<String> nonDup= new ArrayList<>();
        for (String each : names) {
            if(nonDup.contains(each)){
                continue;
            }
            nonDup.add(each);

              int max=nth.get(0);
        for (int i = 0; i < nth.size(); i++) {
            if(nth.get(i)>max){
                max=nth.get(i);
         */



        ArrayList<Integer>num= new ArrayList<>();
        num.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,3,4,5,6,7));
        ArrayList<Integer>noDup= new ArrayList<>();
        ArrayList <Integer> largestNumber = new ArrayList<>();

        largestNumber.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        ArrayList <Integer> nonDup = new ArrayList<>();
        int n= 5;

        for (Integer each : largestNumber) {
            if(nonDup.contains(each)){
                continue;
            }
            nonDup.add(each);
        }
        Collections.sort(nonDup);

        System.out.println(nonDup);

        System.out.println(nonDup.get(nonDup.size()-n));

        System.out.println("----....................''''''''''''''''''''''");



        ArrayList<Integer>list= new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        ArrayList<Integer>newList= new ArrayList<>();
        for (Integer each : list) {
            if(each !=0){
                newList.add(each);
            }

        }
        list.removeAll(newList);
        newList.addAll(list);
        //System.out.println(list);
        System.out.println(newList);




        }



}
