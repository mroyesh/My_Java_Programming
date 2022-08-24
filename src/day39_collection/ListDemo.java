package day39_collection;

import java.util.*;

public class ListDemo {


    public static void main(String[] args) {
        ArrayList<Integer>arrayList= new ArrayList<>();

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);

        arrayList.remove(0);
        arrayList.get(0);

        System.out.println(arrayList);


        System.out.println("--------------------------------------");


        List<Integer>linkedList= new LinkedList<>();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);
        System.out.println(linkedList);

        linkedList.remove(0);
        linkedList.get(0);
        System.out.println(linkedList);


        System.out.println("-------------------------------------");

        Vector<Integer> victor= new Vector<>();

        victor.add(10);
        victor.add(20);
        victor.add(30);
        victor.add(40);
        victor.add(50);

        System.out.println( victor.get(1));
        victor.remove(0);

        System.out.println(victor);

        System.out.println("-------------------------------------");


        Stack<Integer> stack= new Stack<>();
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.add(6);

        System.out.println(stack);

        System.out.println("=========================================");
        int lastElement= stack.pop();
        System.out.println(lastElement);

        System.out.println("-----------------------------------------");

        System.out.println(stack);
        int secondLastElement= stack.pop();
        System.out.println(secondLastElement);

        System.out.println(stack);



    }
}
