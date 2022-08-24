package day25_constractors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {

        DateTimeFormatter df= DateTimeFormatter.ofPattern("EEEE, MM/d/y");
        LocalDate today= LocalDate.now();
        System.out.println(today.format(df));
        LocalDate date1= LocalDate.of(2022, 4, 18);
        System.out.println(date1.format(df));

        DateTimeFormatter tf= DateTimeFormatter.ofPattern("HH:m");
        LocalTime time1= LocalTime.of(7, 49);
        System.out.println(time1.format(tf));

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("EEEE, MMMM/d/y  hh:mm");
        LocalDateTime starts= LocalDateTime.now();
        System.out.println(starts.format(dtf));
    }
}
