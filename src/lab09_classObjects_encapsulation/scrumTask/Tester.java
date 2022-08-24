package lab09_classObjects_encapsulation.scrumTask;

import java.util.ArrayList;

public class Tester {

    private String name;
    private int age;
    private char gender;
    private String id;
    private String jobTitle;
    private double hourlyRate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ( name == null || name.isBlank() || name.isEmpty() ) {
            System.err.println("Invalid name" + name);
            System.exit(1);
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age < 18 ) {
            System.out.println("Invalid age for the tester" + name);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if ( !(gender == 'M' || gender == 'F') ) {
            System.out.println("Invalid gender" + gender);

        }
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if ( jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank() ) {
            System.err.println("Invalid job Title" + jobTitle);
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if ( hourlyRate < 0 ) {
            System.err.println("Hourly rate of tester cannot be negative");
            System.exit(1);
        }
        this.hourlyRate = hourlyRate;
    }


    public Tester(String name, int age, char gender, String id, String jobTitle, double hourlyRate) {
        setName(name);
        setAge(age);
        setGender(gender);
        setId(id);
        setJobTitle(jobTitle);
        setHourlyRate(hourlyRate);
    }

    public double getSalary(){
        return hourlyRate*40*52;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", Salary=" + getSalary() +
                '}';
    }

    public void testing(){
        System.out.println(name+"testing application");
    }
}
