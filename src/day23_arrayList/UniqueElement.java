package day23_arrayList;

import java.util.ArrayList;

public class UniqueElement {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
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

        for (String each : names) {
            if(names.indexOf(each)== names.lastIndexOf(each));
        }
        System.out.println();

        boolean isYasin= names.contains("Yasin");
        System.out.println(isYasin);


    }
}
