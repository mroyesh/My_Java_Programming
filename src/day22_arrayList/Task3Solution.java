package day22_arrayList;

import java.util.ArrayList;

public class Task3Solution {
    public static void main(String[] args) {
        ArrayList <Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);
        numbers.add(2,100);
        System.out.println(numbers);

    }

}
