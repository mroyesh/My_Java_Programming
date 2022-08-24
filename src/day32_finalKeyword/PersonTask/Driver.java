package day32_finalKeyword.PersonTask;

import java.time.LocalDate;

public class Driver extends Person {

    public Driver(String name, char gender, int age, LocalDate dateOfBirth) {
        super(name, gender, age, dateOfBirth);
    }

    public  final void drive(){
        System.out.println(getName()+ " drives 400 miles everyday");
    }

}
