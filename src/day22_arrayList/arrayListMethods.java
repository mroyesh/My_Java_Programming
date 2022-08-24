package day22_arrayList;

import java.util.ArrayList;

public class arrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        System.out.println(list);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(1, 60);
        list.add(1,65);
        System.out.println(list);

        System.out.println(list.get(2));


        System.out.println("--------------------------------");
        ArrayList<String> studentsList= new ArrayList<>();
        studentsList.add("Mohammad");
        studentsList.add("Ali");
        studentsList.add("Nabi");
        studentsList.add("Hadi");
        studentsList.set(2,"Aziz");
        System.out.println(studentsList.size());
        System.out.println(studentsList);
        String studentThree=studentsList.get(2);

        String firstStudent= studentsList.get(0);
        System.out.println(firstStudent);
        System.out.println(studentThree);

        String lastStudent= studentsList.get(studentsList.size()-1);
        System.out.println(lastStudent);



    }
}
