package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Yasin");
        names.add("Ali");
        names.add("Javid");
        names.add("Reza");
        names.add("Diana");
        names.add("Ali");
        names.add("Ali");
        names.add("Javid");
        names.add("Reza");
        names.add("Karim");
        names.add("Zia");
        ArrayList<String>nonDup= new ArrayList<>();
        for (String each : names) {
            if(nonDup.contains(each)){
                continue;
            }
            nonDup.add(each);
        }
        System.out.println(nonDup);

    }
}
