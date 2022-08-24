package day23_arrayList.PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list.set(4, 0);
        System.out.println(list);
        //list.add(0);

        //list.set(list.size()-1,0);
        System.out.println(list);

        System.out.println("-------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9));
        list2.removeIf(each -> each < 7);
        System.out.println(list2);


    }
}
