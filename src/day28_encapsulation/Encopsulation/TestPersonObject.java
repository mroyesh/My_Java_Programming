package day28_encapsulation.Encopsulation;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {
        Person person1= new Person("Yasin", 34, 'M', LocalDate.of(1988,1,1));
        System.out.println(person1);
        System.out.println(person1.getGender());
    }
}
