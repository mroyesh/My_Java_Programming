package day40_collection;

import java.util.*;

public class IterableExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 40, 50, 1, 1, 2, 2, 3, 4, 5, 6, 6, 6));

        /*( Integer each: list){
            if(each < 5){
                list.remove(each);
            }*/
        /*for (int i = 0; i <list.size(); i++){
            if(list.get(i)<5){
                list.remove(i);
        }
        }*/

        for(int i=0; i<list.size(); i++){
            if(list.get(i)< 5){
                list.remove(i);
            }
        }
        System.out.println(list);

        System.out.println("---------------------------------------");


        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(10, 20, 30, 40, 50, 1, 1, 2, 2, 3, 4, 5, 6, 6, 6));

        Iterator<Integer> it = list2.iterator();
        while (it.hasNext()) {
            Integer each = it.next();
            if ( each <= 6 ) {
                it.remove();
            }
        }
        System.out.println(list2);
        System.out.println("------------------------------------------------------");

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 1, 1, 2, 2, 3, 4, 5, 6, 6, 6));

        for (Iterator<Integer> i = list3.iterator(); i.hasNext(); ) {
            Integer each = i.next();
            if ( each < 5 ) {
                i.remove();
            }
        }
        System.out.println(list3);

        System.out.println("-----------------------------------------------------");


        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10, 20, 30, 40, 50, 1, 1, 2, 2, 3, 4, 5, 6, 6, 6));

        list4.removeIf(each -> each <= 20);

        System.out.println(list4);

        System.out.println("-----------------------------------------------------");


        List<Integer> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(10, 20, 30, 40, 50, 1, 1, 2, 2, 3, 4, 5, 6, 6, 6));

        list5.removeIf(p -> p < 5);

        System.out.println(list5);


    }
}
