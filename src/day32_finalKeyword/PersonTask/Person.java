package day32_finalKeyword.PersonTask;

import java.time.LocalDate;

public class Person {
    private String name;
    private final char gender;
    private final int age;
    private final LocalDate dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, char gender, int age, LocalDate dateOfBirth) {
        this.name = name;
        if(!(gender=='M'||gender=='F')){
            System.err.println("Invalid gender"+gender);
            System.exit(1);
        }
        this.gender = gender;
        this.age = LocalDate.now().getYear()-dateOfBirth.getYear();
        this.dateOfBirth = dateOfBirth;
    }

    public static final int numberOfHead;
    static {
        numberOfHead=1;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }
    public final void breath(){ // to make sure that implementation
        System.out.println(name+ " is breathing");
    }

    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}

/*

variables:
name, gender age, dateOfBirth;
numberOfHead

Methods:
eat(), sleep(), drink()
breath()
 */
