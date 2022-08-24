package day29_inheritance.TaskSolutions;

public class Driver extends Employee {

    public Driver(String name, String id, String jobTitle, char gender, int age, double salary) {
        super(name, id, jobTitle, gender, age, salary);
    }

    public void drive(){
        System.out.println(getName()+ " is test driving the car");
    }
}
