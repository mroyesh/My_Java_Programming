package day24_DateAndTime;
import java.time.LocalDate;
public class LocalTime {
    public static void main(String[] args) {
        LocalDate Birthday= LocalDate.of(1993, 6, 16);
        System.out.println("Happy Birth Day\n You are "+Birthday.minusMonths(6).minusDays(16).plusYears(29));

       LocalDate myBirthDay= LocalDate.ofEpochDay(LocalDate.of(2020, 12, 30).minusYears(2).minusDays(34).getYear());

    }
}
