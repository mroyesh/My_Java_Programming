package day26_statics.StudentTask;

import java.util.Arrays;

public class TestObjects {

    public static void main(String[] args) {
        Student student1= new Student("Ali", "234",34, 'M');
        Student student2= new Student("Ali", "234",34, 'M');
        Student student3= new Student("Ali", "234",34, 'M');
        Student student4= new Student("Ali", "234",34, 'M');
        Student student5= new Student("Ali", "234",34, 'M');


        StudentsGroup group1= new StudentsGroup("Java trackers", 1);
       Student[] students= {student1,student2, student3,student4};
        group1.addStudent(student5);
        group1.addStudent(students);
        group1.addStudent("Yasin", 34, 'M', "AD3219");

        group1.removeStudent("Ad3214");

        System.out.println(group1);


    }
}

