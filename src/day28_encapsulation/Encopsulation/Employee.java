package day28_encapsulation.Encopsulation;

public class Employee {
    private String name;
    private double salary;
    private String jobTitle;
    private int age;


    public Employee(String name, double salary, String jobTitle, int age) {
        setName(name);
        setAge(age);
        setSalary(salary);
        setJobTitle(jobTitle);


    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {

        if ( jobTitle.isBlank() || jobTitle.isEmpty() ) {
            System.err.println("Not entry for job title : " + jobTitle);
        }
        this.jobTitle = jobTitle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age < 16 ) {
            System.err.println("Invalid age; " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public String getName() {
        if ( name == null ) {
            name = "Unknown";
        }

        return name;
    }

    public void setName(String name) {
        if ( name.isEmpty() || name.isBlank() ) {
            System.err.println("Employee name can not be empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public double getSalary() { // READ
        return salary;
    }

    public void setSalary(double salary) { // WRITE
        if ( salary < 0 ) {
            System.err.println("Salary can not be negative: " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
