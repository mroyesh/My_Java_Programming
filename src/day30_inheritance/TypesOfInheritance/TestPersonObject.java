package day30_inheritance.TypesOfInheritance;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {


        Student student = new Student("Ali", 'M', LocalDate.of(2022, 6, 29), 'A', "333000");

        President president46 = new President("Biden", 'M', LocalDate.of(2020, 1, 6), LocalDate.of(2019, 10, 10));

        Employee TargetEmployee = new Employee("Nazgul", 'F', LocalDate.of(1994, 9, 20), "ACB123", "Cashier", 30000);

        Teacher mathTeacher = new Teacher("Reza", 'M', LocalDate.of(1984, 4, 12), "12345123", "mathTeacher", 45000);


        student.study();
        mathTeacher.teach();
        president46.lie();
    }
}