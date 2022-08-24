package day25_constractors;

import java.time.LocalDate;

public class TestEmployeeObject {
    public static void main(String[] args) {


        Employee e1 = new Employee("Ali", 26, 'M', "developer", 106000, LocalDate.of(2023, 2, 12));
        System.out.println(e1);

    }
}
