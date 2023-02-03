package day40_collection;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue <Integer> queue= new PriorityQueue<>();

        Queue <Integer> queue1 = new PriorityQueue<>();

        Queue< Integer> queue2= new ArrayDeque<>();

        queue.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(queue);

        queue1.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(queue1);

        queue2.addAll(Arrays.asList(100,200,300,400,500,600,700));

        System.out.println(queue2);

        Queue<String > names = new ArrayDeque<>(Arrays.asList("Ali","Aziz","Yasin"));
        System.out.println(names);


    }
}
