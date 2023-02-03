package day24_DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateIntro {
    public static void main(String[] args) {

        LocalDate DOB= LocalDate.of(2022, 5, 14);
        System.out.println(DOB);

        LocalDate today= LocalDate.now();
        System.out.println(today);


        System.out.println(today.getYear());

        System.out.println(today.getMonth());
        System.out.println(today.getChronology());

        System.out.println(today.getDayOfYear());

        System.out.println(today.getDayOfWeek());

        System.out.println(today.plusMonths(12));

        LocalDate birthday= LocalDate.of(2014, 9, 19);
        System.out.println("Birthday of Wania is: " +birthday);
        System.out.println(birthday.getDayOfWeek());

        System.out.println(birthday.getDayOfMonth());
        System.out.println(birthday.getDayOfYear());
        System.out.println(birthday);

         birthday=birthday.plusYears(18);
        System.out.println(birthday);

        LocalDate graduation = LocalDate.of(2000,5, 20);
        graduation=graduation.plusYears(2);
        graduation=graduation.plusMonths(7);
        System.out.println(graduation);
        graduation=graduation.plusWeeks(2);
        graduation= graduation.plusDays(100);
        System.out.println(graduation);
        graduation= graduation.plusYears(20);
        System.out.println(graduation);
        LocalDate graduationFromCYDEO= LocalDate.of(2023, 2, 10);
        LocalDate firstHire= graduationFromCYDEO.plusMonths(1).plusDays(10).plusWeeks(1);
        System.out.println(firstHire);

        System.out.println("------------------------------------");

        LocalDate grad_date= LocalDate.of(2023, 1, 1);
        System.out.println(grad_date.isAfter(LocalDate.of(2022,2,20)));

        System.out.println("--------------------------------------");

        System.out.println(LocalDate.of(2000, 6,16).isLeapYear());


    }
}
