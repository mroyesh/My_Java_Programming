package day32_finalKeyword.PersonTask;

import java.time.LocalDate;

public class Student  extends Person{

    private char grade;
    private  final  String studentID;

    public Student(String name, char gender, int age, LocalDate dateOfBirth, char grade, String studentID) {
        super(name, gender, age, dateOfBirth);
        setGrade(grade);
        this.studentID = studentID;
}

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if(!(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F')){
            System.out.println(" Invalid grade"+grade);
            System.exit(1);
        }
        this.grade = grade;
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating one apple every morning");
    }

    @Override
    public void drink() {
        System.out.println( getName()+" never drink coffee");
    }


    @Override
    public void sleep() {
        System.out.println(getName()+ " is sleeping only 5 hours in 24 hours");
    }

    @Override
    public String toString() {
        return super.toString().replace("}","")+
                "grade=" + grade +
                ", studentID='" + studentID + '\'' +
                '}';
    }
}
