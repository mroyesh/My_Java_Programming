package day17_CustomClass.PracticeTasks;

public class Student {

    public String name;
    public char gender;
    public int age;
    public String studentID;
    public char grade;
    public boolean isFullTime;

    public void setInfo(String name, char gender, int age, String studentID, char grade, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentID = studentID;
        this.grade = grade;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID='" + studentID + '\'' +
                ", grade=" + grade +
                ", isFullTime=" + isFullTime +
                '}';
    }
    public void styde(){
        System.out.println(name+ " is studying 15 hours a day");
    }
}
