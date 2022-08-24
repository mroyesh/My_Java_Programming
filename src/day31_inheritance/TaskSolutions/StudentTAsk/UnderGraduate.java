package day31_inheritance.TaskSolutions.StudentTAsk;

public class UnderGraduate extends Student{
    public UnderGraduate(String name, int age, char gender, String studentID, String fieldOfStudy, char grade, String SchoolName) {
        super(name, age, gender, studentID, fieldOfStudy, grade, SchoolName);
    }

    @Override
    public void study() {
        System.out.println(getName()+ " is under graduate students");
    }

}
