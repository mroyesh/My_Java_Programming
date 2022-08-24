package day26_statics.StudentTask;

public class Student {

    public String name, id;
    public int age;
    public char gender;


    public Student(String name, String id, int age, char gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;


}


    public void study(){ System.out.println(name+" is studying");

    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID='" + id + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
