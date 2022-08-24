package lab12_00p_exceptions.ResturantTask;

public abstract class Employee {

    private String name, jobTitle;
    private int age;
    private final char gender;
    private final String id;
    private double salary;

    public Employee(String name, String id, String jobTitle, int age, char gender, double salary) {
        setName(name);
        if ( id == null || id.isEmpty() ) {
            throw new IllegalArgumentException("ID can not set to null or empty");
        }
        this.id = id;
        setJobTitle(jobTitle);
        setAge(age);
        if ( !(gender == 'M' || gender == 'F') ) {
            throw new NoSuchPersonException("Not valid gender");
        }
        this.gender = gender;
        setSalary(salary);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if ( name == null || name.isEmpty() ) {
            throw new NoSuchPersonException("Name can not be null or empty");
        }
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if ( jobTitle == null || jobTitle.isEmpty() ) {
            throw new NoSuchJobException("Job title can not be null or empty");
        }
        this.jobTitle = jobTitle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age < 0 ) {
            throw new NoSuchPersonException("Invalid age");
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if ( salary < 0 ) {
            throw new NoSuchJobException("Salary can not be negative " + salary);
        }
        this.salary = salary;
    }

    public abstract void work();


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", salary= $" + salary +
                '}';
    }
}
