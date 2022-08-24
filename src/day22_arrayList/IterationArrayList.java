package day22_arrayList;

import java.util.ArrayList;

public class IterationArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3, 1000);
        numbers.add(3, 255);
        System.out.println("This is numbers first "+ numbers);
        System.out.println("-----------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            int each= numbers.get(i);
            System.out.print(each+ " ");
        }
        System.out.println();
        System.out.println("----------------------------------------");


        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i)+ " ");

        }

        System.out.println("=======================================");
        for (Integer each : numbers) {
            System.out.println(each);

        }

 }

}



