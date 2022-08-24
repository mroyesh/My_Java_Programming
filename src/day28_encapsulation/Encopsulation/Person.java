package day28_encapsulation.Encopsulation;

import java.rmi.ServerError;
import java.time.LocalDate;

public class Person {

    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;

    public Person(String name, int age, char gender, LocalDate dateOfBirth) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
    }

    public String getName() {
        if ( name==null) {
            name = "Unknown";
        }
        return name;
    }

    public void setName(String name) {
        if ( name.isEmpty() || name.isBlank()) {
            System.err.println("Name can not be empty or blank");
            System.exit(1);
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age < 0 || age > 120 ) {
            System.err.println("Invalid age" + age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if ( !(gender == 'M' || gender == 'F') ) {
            System.err.println("Invalid gender entry "+ gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", dateOfBirth=" + getDateOfBirth() +
                '}';
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if ( dateOfBirth.isAfter(LocalDate.of(2022,6,23))){
            System.err.println("Invalid date of Birth"+dateOfBirth);
            System.exit(1);

        }
        this.dateOfBirth=dateOfBirth;


    }


}
/*

name, age, gender, dateOfBirth.
 name can not be null empty or blank.
 read: if name is not, return "Unknown"  instead

 age : write : age con not be less than zero or greater than 120

 gender:
 write : gender only can br 'M' or 'F'


 dateIfBirth:
 write can not be after today's date

 add constructor that can set all the fields


 */