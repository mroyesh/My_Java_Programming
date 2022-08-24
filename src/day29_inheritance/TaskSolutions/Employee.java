package day29_inheritance.TaskSolutions;

public class Employee {
    private String name, id, jobTitle;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, String id, String jobTitle, char gender, int age, double salary) {
        setName(name);
        setId(id);
        setJobTitle(jobTitle);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        this.jobTitle = jobTitle;
    }

    public char getGender() {

        return gender;
    }

    public void setGender(char gender) {

        if( ! ( gender=='M'|| gender== 'F')){
            System.out.println("Invalid gender"+ gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0) {
            if ( age > 18 && age < 65 ) {
                System.out.println("Invalid age" + age);
                System.exit(1);
            }
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if( salary<0){
            System.out.println("invalid salary"+ salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public String toString() {
        return getClass().getSimpleName() +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
