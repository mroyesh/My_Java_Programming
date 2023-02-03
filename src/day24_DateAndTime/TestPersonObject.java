package day24_DateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObject {
    public static void main(String[] args) {
        Person[]people= { new Person(), new Person(), new Person(), new Person(), new Person()};
        people[0].setInfo("Ali", 'M', LocalDate.of(2014, 9, 19));
        people[1].setInfo("Yasin", 'M', LocalDate.of(1988,1,1));
        people[2].setInfo("Jawid", 'M', LocalDate.of(1906,1, 20));
        people[3].setInfo("Hasan", 'M', LocalDate.of(1985, 12,4));
        people[4].setInfo("Diana", 'M', LocalDate.of(1986,2,14));


        ArrayList<Person>studentList= new ArrayList<>();
        studentList.addAll(Arrays.asList(people));


        for (Person eachStudent : studentList) {
            System.out.println("Name of the student: "+eachStudent.name+ " Date of birth: "+eachStudent.dateOfBirth+ "Age of the student: "+eachStudent.age);

        }
        studentList.removeIf(person -> person.age>30);
        System.out.println(studentList+" ");



    }
}
