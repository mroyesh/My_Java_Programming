package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add((30));
        numbers.add(40);
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.addAll(numbers);
        System.out.println(numbers);
        list1.addAll(1, numbers);
        System.out.println(list1);

        System.out.println("-----------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(75, 80, 90, 80, 78));
        System.out.println(scores);

        System.out.println("------------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Yasin", "Hasan", "Javid", "Bilal", "Kazim"));
        System.out.println(students);

        students.addAll(2, Arrays.asList("Aziz", "Nabi", "Karim", "Hadi"));
        System.out.println(students);

        System.out.println("--------------------------------------------------");

        Integer[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(num));
        //l1.addAll(Arrays.asList(num));

        System.out.println("-----------------------------------------------");
        ArrayList<String> employee = new ArrayList<>();
        employee.addAll(Arrays.asList("Alina", "Muhtar", "Azim", "Fadi"));
        boolean hasAlina = employee.contains("Alina");

        System.out.println(hasAlina);

        boolean hasAzimAlina = employee.containsAll(Arrays.asList("Azim", "Alina"));
        System.out.println(hasAzimAlina);

        System.out.println("------------------------------------------------------");

       ArrayList<Integer>list= new ArrayList<>(Arrays.asList(10, 20, 10, 10, 30, 20, 40, 50, 20, 40, 40, 60, 70, 60, 60));
       list.removeAll(Arrays.asList(10, 20, 40, 60));
        System.out.println(list);

        System.out.println("-------------------------------------------");

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.addAll(Arrays.asList(10, 20, 10, 10, 30, 20, 40, 50, 20, 40, 40, 60, 70, 60, 60));
        num1.retainAll(Arrays.asList(30, 20, 70));
        System.out.println(num1);
    }
}
