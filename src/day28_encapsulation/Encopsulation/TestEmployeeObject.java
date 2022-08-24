package day28_encapsulation.Encopsulation;

import java.io.PrintStream;

public class TestEmployeeObject {
    public static void main(String[] args) {


        Employee employee1= new Employee("Ali", 200000, "Java Developer", 34);
        employee1.setSalary(200000);

        employee1.setSalary(120000);
        System.out.println(employee1.getSalary());
        System.out.println(employee1);

        //employee1.setName(" ");
        System.out.println(employee1.getName());


        Employee employee2 = new Employee("yasin", 200000, "Java developer", 34);

        System.out.println(employee2);
    }

}
