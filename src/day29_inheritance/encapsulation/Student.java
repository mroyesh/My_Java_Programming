package day29_inheritance.encapsulation;

public class Student {
    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;


    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public int getAge() {
        if(name==null){
            name= "Unknown";
        }
        return age;
    }

    public void setAge(int age) {
        if ( age < 0 ) {
            System.out.println("Invalid age");
            System.exit(1);
        }
        if ( age < 5 || age > 90 ) {
            System.out.println("Invalid age ");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if ( gender == 'M' || gender == 'F' ) {
            this.gender = gender;
        } else {

            System.out.println("invalid " + gender);

        }
    }


    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {

        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getName(){
      /*  if(name==null){
            name="Unknown";
        }*/
        return name;
    }

    public void setName(String name){
       /* if(name.isEmpty()){
            System.out.println("Invalid student name");
            System.exit(1);
        }*/
        this.name= name;
    }

}
