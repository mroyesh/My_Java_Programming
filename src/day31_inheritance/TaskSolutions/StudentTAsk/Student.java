package day31_inheritance.TaskSolutions.StudentTAsk;

public class Student extends Person {
    private String studentID, fieldOfStudy;
    private char grade;
    private String schoolName;


    public Student(String name, int age, char gender, String studentID,
                   String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if ( fieldOfStudy == null || fieldOfStudy.isEmpty() ) {
            System.err.println("Invalid field of study");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if ( !(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') ) {
            System.err.println("Invalid grade" + grade);
            System.exit(1);
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if ( schoolName == null || schoolName.isEmpty() ) {
            System.err.println("Invalid school name");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public void study() {
        System.out.println(getName() + " is studying math");
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString().replace("}", " ") +
                "studentID='" + studentID + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", School Name=" + schoolName +
                '}';
    }
}
