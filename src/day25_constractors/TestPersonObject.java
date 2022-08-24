package day25_constractors;

import java.security.spec.RSAOtherPrimeInfo;
import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {


        Person person1 = new Person("Aziz", 34, 'M', LocalDate.of(2021, 3, 14), true, true);
        Person person2 = new Person("Yasin", 34, 'M', LocalDate.of(2016, 7, 20), false, true);
        Person person3 = new Person("javid", 36, 'M', LocalDate.of(2022, 2, 20), true, false);
        Person person4 = new Person("Nazgul", 27, 'F', LocalDate.of(2021, 10, 10), true, true);
        Person person5 = new Person("Diana", 31, 'F', LocalDate.of(2018, 12, 21), false, false);


        System.out.println("person1 = " + person1);
        person1.isDrinking("water");
        person1.eat();
        System.out.println("person2 = " + person2);
        System.out.println("person3 = " + person3);
        System.out.println("person4 = " + person4);
        System.out.println("person5 = " + person5);
    }
}
