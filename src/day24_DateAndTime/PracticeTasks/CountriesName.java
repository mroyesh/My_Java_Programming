package day24_DateAndTime.PracticeTasks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountriesName {
    public static void main(String[] args) {
        ArrayList<String> countryNames = new ArrayList<>();
        countryNames.addAll(Arrays.asList("Afghanistan", "Burkina Faso", "Netherlands", "Philippines", "India", "Canada", "Japan"));
        countryNames.removeIf(p -> p.length() >= 10);
        System.out.println(countryNames);


        System.out.println("----------------------------------");


        ArrayList<String> firstAndLastSame = new ArrayList<>();
        firstAndLastSame.addAll(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));
        firstAndLastSame.removeIf(p -> p.substring(0, 1).equalsIgnoreCase(p.substring(p.length() - 1)));
        System.out.println(firstAndLastSame);


    }
}

