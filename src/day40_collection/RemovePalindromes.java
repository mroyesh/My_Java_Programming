package day40_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Python", "Cydeo", "Civic", "Level"));

        Iterator<String > it= names.iterator();
        while (it.hasNext()){
            String each= it.next();
            String reverse="";
            for (int i = each.length()-1; i >=0 ; i--) {
                reverse += each.charAt(i);
            }
                if(each.equalsIgnoreCase(reverse)){
                    it.remove();

                }
            }
        System.out.println(names);
        }
}

