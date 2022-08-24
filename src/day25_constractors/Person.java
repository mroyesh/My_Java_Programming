package day25_constractors;

import javax.xml.namespace.QName;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;
    public boolean isMarred;
    public boolean isEmployed;

    public Person(String name, int age, char gender, LocalDate dateOf_birth, boolean isMarred, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOf_birth;
        this.isMarred = isMarred;
        this.isEmployed = isEmployed;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOf_birth=" + dateOfBirth +
                ", isMarred=" + isMarred +
                ", isEmployed=" + isEmployed +
                ", gender=" + gender +
                ", Date of Birth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("E,  M/d/y")) +
                ", isEmployed=" + isEmployed +
                '}';
    }

    public void eat() {
        System.out.println(name+ " is eating lunch on time.");

    }

    public void sleeping() {
        System.out.println(name+" Have to sleep on time.");

    }

    public void isDrinking(String drink) {
        System.out.println(name+" is drinking "+drink+" every day");

    }
}



