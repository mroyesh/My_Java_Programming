package day24_DateAndTime.PracticeTasks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class dateAndLeapYear {
    public static void main(String[] args) {

        ArrayList<LocalDate>dates= new ArrayList<>();
        dates.addAll(Arrays.asList( LocalDate.of(1990, 2,14), LocalDate.of(2016, 12, 4),
        LocalDate.of(2018, 12, 2)));
        dates.removeIf(p->p.isBefore(LocalDate.of(2016, 8, 15)));

        System.out.println(dates);



        System.out.println("---------------------------------------");

        System.out.println(isLeap(1999, 12, 14));

    }
    public static boolean isLeap(int birthYear, int month, int day) {
        return LocalDate.of(birthYear, month, day).isLeapYear();
    }
}
