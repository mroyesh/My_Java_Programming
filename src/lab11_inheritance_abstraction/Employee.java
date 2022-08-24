package lab11_inheritance_abstraction;

public abstract class Employee extends Person{


    private final String id;
    private String jobTitle;
    private double salary;


    public Employee(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender);
        this.id = id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public abstract void work();

    @Override
    public String toString() {
        return super.toString().replace("}", "")+
                "ID ='" + id + '\'' +
                ", Job title=" + jobTitle +
                ", salary= $" + salary +
                '}';
    }
}
