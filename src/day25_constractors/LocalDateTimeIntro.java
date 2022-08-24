package day25_constractors;

import java.time.LocalDateTime;

public class LocalDateTimeIntro {
    public static void main(String[] args) {

        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts);


        LocalDateTime end= LocalDateTime.of(23, 5, 11, 14, 0);
        System.out.println(end);
        System.out.println(starts.getDayOfWeek());
    }
}