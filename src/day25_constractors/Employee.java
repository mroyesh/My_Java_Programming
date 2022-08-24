package day25_constractors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public LocalDate hired_date;

    public Employee(String name, int age, char gender, String jobTitle, double salary, LocalDate hired_date){

    }// allows us to set all instance variable of objects as soon as the object is created

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hired_date=" + hired_date.format(DateTimeFormatter.ofPattern("MMMM/d/12")) +
                '}';
    }// allows us to print the objects
}
