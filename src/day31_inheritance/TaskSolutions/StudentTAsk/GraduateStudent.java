package day31_inheritance.TaskSolutions.StudentTAsk;

public class GraduateStudent extends Student{
    public GraduateStudent(String name, int age, char gender, String studentID, String fieldOfStudy, char grade, String SchoolName) {
        super(name, age, gender, studentID, fieldOfStudy, grade, SchoolName);
    }

    @Override
    public void study() {
        System.out.println("Graduated student study less than active college student");
    }
    public void seekJob(){
        System.out.println(getName()+ " is actively seeking job");
    }
}
