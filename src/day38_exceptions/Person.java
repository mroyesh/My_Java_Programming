package day38_exceptions;

import java.util.InputMismatchException;

public class Person {

    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        if ( !(gender == 'M' || gender == 'F') ) {// if the gender is invalid
            throw new InputMismatchException("Invalid gender" + gender);// throw the runtime exception and crash the program

        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if ( age == 0 ) {
            throw new RuntimeException("Age has not been set");
        }

        return age;
    }

    public void setAge(int age) {
        if ( age < 0 || age > 150 ) { // if the given age is invalid
            if ( age < 0 ) {// if the age is smaller than zero
                throw new RuntimeException("Age can not set to negative " + age);
            } else if ( age > 150 ) {
                throw new RuntimeException("Age can not set greater than 150, your input is " + age);
            }
        }
        this.age = age;

    }

    public char getGender() {
        return gender;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
