package day23_arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class FirstUniqeElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);
        System.out.println(list);
        for (Integer each : list) {
            int frequency=0;
            for (Integer elements : list) {
            if ( each == elements ) {
                frequency++;
                }
            }
            if(frequency==1){
            System.out.println(each);
            break;
            }


            }
        }


    }


