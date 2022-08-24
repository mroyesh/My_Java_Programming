package day22_arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
        int [] array= new int[5];
        array[0]= 10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;

        System.out.println(Arrays.toString(array));

        System.out.println("---------------------------------");


        ArrayList<Integer>list= new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());
        list.add(12);
        System.out.println(list);


        ArrayList<Integer> numbers= new ArrayList<>();
        System.out.println("numbers = " + numbers);
        System.out.println(numbers.size());
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);
        numbers.add(70);
        numbers.add(80);
        numbers.add(3, 40);
        numbers.add(5, 60);
        System.out.println(numbers);
        System.out.println( numbers.size());
        System.out.println("------------------------------");

        for (int i = 0; i <numbers.size() ; i++) {
            System.out.print(numbers.get(i) +" ");

        }
        System.out.println();

        System.out.println("--------------'''''''--------------------");

        for (Integer each : numbers) {
            System.out.print(each+ " ");
        }
    }
}
