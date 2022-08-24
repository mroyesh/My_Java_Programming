package day33_abstraction.EmployeeTask;

public class Developer extends Employee{

    private String programingLanguage;

    public Developer(String name, int age, char gender, String id, String jobTitle, double salary, String programingLanguage) {
        super(name, age, gender, id, jobTitle, salary);
        setProgramingLanguage(programingLanguage);
    }

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
        this.programingLanguage = programingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is coding "+programingLanguage);

    }

    @Override
    public String toString() {
        return super.toString().replace("}", "")+
                ", Programming language"+ programingLanguage+ "}";

    }
}
