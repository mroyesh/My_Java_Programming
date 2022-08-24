package day24_DateAndTime.PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class secondMax {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));
        list.removeIf(p->p==Collections.max(list));
        list.removeIf(p->p==Collections.min(list));
        int max=Collections.max(list);
        int min= Collections.min(list);
        System.out.println("Second Max number is: "+max);
        System.out.println("Second min number is: "+min);
    }
}
