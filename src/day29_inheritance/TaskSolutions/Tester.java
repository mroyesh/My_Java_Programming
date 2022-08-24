package day29_inheritance.TaskSolutions;

public class Tester extends Employee {
    public Tester(String name, String id, String jobTitle, char gender, int age, double salary) {
        super(name, id, jobTitle, gender, age, salary);
    }

    public void testing(){
        System.out.println(getName()+ " is testing applications");
    }
}
